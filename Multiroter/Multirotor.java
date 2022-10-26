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

}
