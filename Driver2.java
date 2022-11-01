import Airplane.Airplane;
import Copter.*;
import Multiroter.Multirotor;
import DroneMAV.*;
import FlyingObjects.FlyingObjects;
import UAV.*;

/**
 * Assignment 2 Part 2
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 */

public class Driver2 {
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

        System.out.println("helicopter with number " + helicopter.getObjectNumber() + " equals agricultural drone with number " + agDrone.getObjectNumber() + ": " + helicopter.equals(agDrone));
        System.out.println("helicopter with number " + helicopter.getObjectNumber() + " equals helicopter with number " + helicopter2.getObjectNumber() + ": " + helicopter.equals(helicopter2));
        System.out.println("helicopter with number " + helicopter2.getObjectNumber() + " equals helicopter with number " + helicopter3.getObjectNumber() + ": " + helicopter2.equals(helicopter3));

        System.out.println();

        FlyingObjects[] array1 = {airplane, airplane2, helicopter, helicopter2, helicopter3, quadCopter, quadCopter2, multi, multi2, uav, uav2, mav, mav2, agDrone, agDrone2};

        FlyingObjects[] array2 = copyFlyingObjects(array1);

        for (FlyingObjects object : array1){
            System.out.println(object);
        }

        System.out.println();

        for (FlyingObjects object : array2){
            System.out.println(object);
        }

    }
    /** 
     * Copies the given array into a new array of flying objects
     * @param array array of objects that will be copied into a new array as flying objects
     * @return newArray the new array that is a copy
     */
    public static FlyingObjects[] copyFlyingObjects(FlyingObjects[] array){
        FlyingObjects[] newArray = new FlyingObjects[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = new FlyingObjects(array[i]);
        }
        return newArray;
    }
    
}
