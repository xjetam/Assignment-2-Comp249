package Copter;

import Airplane.Airplane;

public class Helicopter extends Airplane{

    private int numOfCylinders;
    private int creationYear;
    private int passengerCapacity;


    public Helicopter(){
        this.numOfCylinders = 0;
        this.creationYear = 0;
        this.passengerCapacity = 0;
        System.out.println("Default constructor Helicopter");
    }

    public Helicopter(String brand, double price, int horsepower, int numOfCylinders, int creationYear, int passengerCapacity){
        super(brand, price, horsepower);
        
        this.numOfCylinders = numOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
        System.out.println("Paramatized constructor Helicopter");
    }

    public Helicopter(Helicopter helicopter){
        super(helicopter);

        this.numOfCylinders = helicopter.getNumOfCylinders();
        this.creationYear = helicopter.getCreationYear();
        this.passengerCapacity = helicopter.getPassengerCapacity();
        System.out.println("Copy constructor Helicopter");
    }


    public int getNumOfCylinders(){
        return this.numOfCylinders;
    }

    public int getCreationYear(){
        return this.creationYear;
    }

    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }


    public void setNumOfCylinders(int numOfCylinders){
        this.numOfCylinders = numOfCylinders;
    }

    public void setCreationYear(int creationYear){
        this.creationYear = creationYear;
    }

    public void setPassengerCapacity(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }

    public String toString(){
        return "This helicopter is manufactured by " + this.getBrand() + ", costs $" + this.getPrice() + ", has " + this.getHorsepower()+ " horsepower, "
        + "has " + this.numOfCylinders + " cylinders, \nwas created in " + this.creationYear + ", and has a capacity of " + this.passengerCapacity + " people.";
    }
    
}

