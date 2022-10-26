
import Copter.*;
import Multiroter.Multirotor;
import DroneMAV.*;

public class Driver {
    
    public static void main(String[] args){
        Quadcopter mycopter = new Quadcopter("Suzuki", 1712, 234, 12, 2021, 40, 400);

        Quadcopter mycopter2 = new Quadcopter(mycopter);
        mycopter2.setBrand("Ford");

        System.out.println(mycopter.getBrand());
        System.out.println(mycopter2.getBrand());

        System.out.println();

        Multirotor myMulti = new Multirotor("Lambo", 1048, 200, 8, 2019, 10, 10);
        Multirotor myMulti2 = new Multirotor(myMulti);
        myMulti2.setBrand("Ferrari");

        System.out.println(myMulti.getBrand());
        System.out.println(myMulti2.getBrand());

        System.out.println();

        AgriculturalDrone agDrone = new AgriculturalDrone(2000, 250, "Zeemers", 2);
        AgriculturalDrone agDrone2 = new AgriculturalDrone(agDrone);
        agDrone2.setWeight(1500);

        System.out.println(agDrone.getWeight());
        System.out.println(agDrone2.getWeight());

    }

}
