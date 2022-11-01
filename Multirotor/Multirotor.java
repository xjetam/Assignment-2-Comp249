package Multirotor;

import Copter.Helicopter;
/**
 * Assignment 2
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 */
public class Multirotor extends Helicopter{
    
    private int numOfRotors;
    /**
     * Default constructor.
     */
    public Multirotor(){
        this.numOfRotors = 0;
        //System.out.println("Default constructor Multirotor");
    }
    /**
     * Constructor that takes parameters.
     * 
     * @param brand brand of MR
     * @param price price of MR
     * @param horsepower horsepower of MR
     * @param numOfCylinders number of cylinders of MR
     * @param creationYear creation year of MR
     * @param passengerCapacity passenger capacity of MR
     * @param numOfRotors num of rotors on MR
     * 
     */
    public Multirotor(String brand, double price, int horsepower, int numOfCylinders, int creationYear, int passengerCapacity, int numOfRotors){
        super(brand, price, horsepower, numOfCylinders, creationYear, passengerCapacity);
        this.numOfRotors = numOfRotors;
        //System.out.println("Paramatized constructor Multirotor");
    }
    /**
     * Copy constructor.
     * 
     * @param multirotor object that is the copy
     */
    public Multirotor(Multirotor multirotor){
        super(multirotor);
        this.numOfRotors = multirotor.getNumOfRotors();
        //System.out.println("Copy constructor Multirotor");
    }

    
    /** 
     * returns numbers of rotors on MR
     * @return int number of rotors of MR
     */
    public int getNumOfRotors(){
        return this.numOfRotors;
    }

    
    /** 
     * sets the number of rotors on MR
     * @param numOfRotors number of rotors on MR
     */
    public void setNumOfRotors(int numOfRotors){
        this.numOfRotors = numOfRotors;
    }

    
    /** 
     * returns the information of MR
     * @return String info of MR
     */
    public String toString(){
        return "Flying object number " + this.getObjectNumber() + ". " + "This quadcopter is manufactured by " + this.getBrand() + ", costs $" + this.getPrice() + ", has " + this.getHorsepower()+ " horsepower, "
        + "has " + this.getNumOfCylinders() + " cylinders, \nwas created in " + this.getCreationYear() + ", has a capacity of " + this.getPassengerCapacity() + " people, "
        + "and has " + this.numOfRotors + " rotors.";
    }

    
    /** 
     * Checks if two objects are equal
     * @param x plane to compare
     * @return boolean true if equal false if not
     */
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
