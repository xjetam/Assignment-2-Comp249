
import Airplane.Airplane;
import Copter.*;
import Multiroter.Multirotor;
import DroneMAV.*;
import UAV.*;

public class Driver {
    
    public static void main(String[] args){
        /*
        Quadcopter mycopter = new Quadcopter("Suzuki", 1712, 234, 12, 2021, 40, 400);

        Quadcopter mycopter2 = new Quadcopter(mycopter);
        mycopter2.setBrand("Ford");

        System.out.println(mycopter);
        System.out.println(mycopter2);

        System.out.println();

        Multirotor myMulti = new Multirotor("Lambo", 1048, 200, 8, 2019, 10, 10);
        Multirotor myMulti2 = new Multirotor(myMulti);
        myMulti2.setBrand("Ferrari");

        System.out.println(myMulti);
        System.out.println(myMulti2);

        System.out.println();

        AgriculturalDrone agDrone = new AgriculturalDrone(2000, 250, "Zeemers", 2);
        AgriculturalDrone agDrone2 = new AgriculturalDrone(agDrone);
        agDrone2.setWeight(1500);

        System.out.println(agDrone);
        System.out.println(agDrone2);

        System.out.println();
        */

        AgriculturalDrone mycopter = new AgriculturalDrone(12, 31, "Yeet", 45);
        AgriculturalDrone mycopter2 = new AgriculturalDrone(mycopter);
        mycopter2.setBrand("Huh");
        System.out.println(mycopter.getClass().toString());
    
        System.out.println(mycopter.equals(mycopter));
        System.out.println(mycopter.equals(mycopter2));


    }

}
