package Multiroter;

import Copter.Helicopter;

public class Multirotor extends Helicopter{
    
    private int numOfRotors;

    public Multirotor(){
        this.numOfRotors = 0;
        System.out.println("Default constructor Multirotor");
    }

    public Multirotor(String brand, double price, int horsepower, int numOfCylinders, int creationYear, int passengerCapacity, int numOfRotors){
        super(brand, price, horsepower, numOfCylinders, creationYear, passengerCapacity);
        this.numOfRotors = numOfRotors;
        System.out.println("Paramatized constructor Multirotor");
    }

    public Multirotor(Multirotor multirotor){
        super(multirotor);
        this.numOfRotors = multirotor.getNumOfRotors();
        System.out.println("Copy constructor Multirotor");
    }

    public int getNumOfRotors(){
        return this.numOfRotors;
    }

    public void setNumOfRotors(int numOfRotors){
        this.numOfRotors = numOfRotors;
    }

    public String toString(){
        return "This quadcopter is manufactured by " + this.getBrand() + ", costs $" + this.getPrice() + ", has " + this.getHorsepower()+ " horsepower, "
        + "has " + this.getNumOfCylinders() + " cylinders, \nwas created in " + this.getCreationYear() + ", has a capacity of " + this.getPassengerCapacity() + " people, "
        + "and has " + this.numOfRotors + " rotors.";
    }

    public boolean equals(Object x){
        if (x != null){
            String otherClass = x.getClass().toString().substring(17);
            if (otherClass.equals("Multirotor")){
                Multirotor otherMultirotor = new Multirotor((Multirotor) x);
                if (otherMultirotor.getBrand().equals(this.getBrand()) && otherMultirotor.getPrice() == this.getPrice() && otherMultirotor.getHorsepower() == this.getHorsepower()
                && otherMultirotor.getNumOfCylinders() == this.getNumOfCylinders() && otherMultirotor.getCreationYear() == this.getCreationYear()
                && otherMultirotor.getPassengerCapacity() == this.getPassengerCapacity() && otherMultirotor.getNumOfRotors() == this.numOfRotors){
                    return true;
                }
            }
        }
        return false;
    }

}
