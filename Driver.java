
import Airplane.Airplane;
import Copter.*;
import Multiroter.Multirotor;
import DroneMAV.*;
import FlyingObjects.FlyingObjects;
import UAV.*;
/**
 * Assignment 2 Part 1
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 */
public class Driver {
    
    
    public static void main(String[] args){
        System.out.println();

        Airplane airplane = new Airplane();
        airplane.setBrand("Ace");
        airplane.setPrice(120000);
        airplane.setHorsepower(2000);
        Airplane airplane2 = new Airplane("FlyBy", 200000, 4000);
        System.out.println(airplane);
        System.out.println(airplane2);

        System.out.println();

        Helicopter helicopter = new Helicopter("Moto", 175000, 3500, 24, 2019, 8);
        Helicopter helicopter2 = new Helicopter("Gleamer", 250000, 4500, 12, 2022, 8);
        Helicopter helicopter3 = new Helicopter(helicopter2);
        System.out.println(helicopter);
        System.out.println(helicopter2);
        System.out.println(helicopter3);
        
        System.out.println();

        Quadcopter quadCopter = new Quadcopter("Suzuki", 1712, 5000, 16, 2021, 20, 400);
        Quadcopter quadCopter2 = new Quadcopter(quadCopter);
        quadCopter2.setBrand("Ford");
        quadCopter2.setHorsepower(2100);
        System.out.println(quadCopter);
        System.out.println(quadCopter2);

        System.out.println();

        Multirotor multi = new Multirotor("Lambo", 400000, 6000, 14, 2019, 25, 8);
        Multirotor multi2 = new Multirotor(multi);
        multi2.setBrand("Ferrari");
        multi2.setHorsepower(6500);
        multi2.setPrice(450000);
        System.out.println(multi);
        System.out.println(multi2);

        System.out.println();

        UAV uav = new UAV(4000, 80000);
        UAV uav2 = new UAV(3300, 110000);
        System.out.println(uav);
        System.out.println(uav2);

        System.out.println();

        MAV mav = new MAV(1500, 50000, "JRX-200", 5);
        MAV mav2 = new MAV(1600, 60000, "MSR-400", 8);
        System.out.println(mav);
        System.out.println(mav2);

        System.out.println();

        AgriculturalDrone agDrone = new AgriculturalDrone(2000, 25000, "Zeemers", 200);
        AgriculturalDrone agDrone2 = new AgriculturalDrone(agDrone);
        agDrone2.setWeight(1500);
        agDrone2.setPrice(40000);
        System.out.println(agDrone);
        System.out.println(agDrone2);

        System.out.println();

        System.out.println(helicopter.equals(agDrone));
        System.out.println(helicopter.equals(helicopter2));
        System.out.println(helicopter2.equals(helicopter3));

        System.out.println();

        FlyingObjects[] array1 = {airplane, airplane2, helicopter, helicopter2, helicopter3, quadCopter, quadCopter2, multi, multi2, uav, uav2, mav, mav2, agDrone, agDrone2};

        findLeastAndMostExpensiveUAV(array1);

        Multirotor multi3 = new Multirotor("Toyota", 500000, 6500, 16, 2020, 20, 8);
        Multirotor multi4 = new Multirotor("Hyundai", 600000, 6800, 18, 2018, 20, 10);

        System.out.println();

        FlyingObjects[] array2 = {airplane, airplane2, helicopter, helicopter2, helicopter3, quadCopter, quadCopter2, multi, multi2, multi3, multi4, mav, mav2, agDrone, agDrone2};
        findLeastAndMostExpensiveUAV(array2);
    }

    
    /** 
     * If they exsist, finds the least and most expensive UAV and displays them.
     * @param array array of objects that will be searched for UAVs
     */
    public static void findLeastAndMostExpensiveUAV(FlyingObjects[] array){
        int counter = 0;
        for (FlyingObjects object : array){
            if (object.getClass().toString().equals("class UAV.UAV")){
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("No UAV objects found in array.");
        }
        else{
            UAV[] UAVs = new UAV[counter];
            int UAVcounter = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i].getClass().toString().equals("class UAV.UAV")){
                    UAVs[UAVcounter] = (UAV) array[i];
                    UAVcounter++;
                }
            }

            int indexMax = 0;
            int indexMin = 0;

            for (int i = 0; i < counter; i++){
                if (UAVs[i].getPrice() < UAVs[indexMin].getPrice()){
                    indexMin = i;
                }
                else if (UAVs[i].getPrice() > UAVs[indexMax].getPrice()){
                    indexMax = i;
                }
            }
            System.out.println("Minimum UAV price: ");
            System.out.println(UAVs[indexMin]);
            System.out.println();
            System.out.println("Maximum UAV price: ");
            System.out.println(UAVs[indexMax]);
        }
    }


}
