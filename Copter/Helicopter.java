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


    
    /** 
     * @return int
     */
    public int getNumOfCylinders(){
        return this.numOfCylinders;
    }

    
    /** 
     * @return int
     */
    public int getCreationYear(){
        return this.creationYear;
    }

    
    /** 
     * @return int
     */
    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }


    
    /** 
     * @param numOfCylinders
     */
    public void setNumOfCylinders(int numOfCylinders){
        this.numOfCylinders = numOfCylinders;
    }

    
    /** 
     * @param creationYear
     */
    public void setCreationYear(int creationYear){
        this.creationYear = creationYear;
    }

    
    /** 
     * @param passengerCapacity
     */
    public void setPassengerCapacity(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "This helicopter is manufactured by " + this.getBrand() + ", costs $" + this.getPrice() + ", has " + this.getHorsepower()+ " horsepower, "
        + "has " + this.numOfCylinders + " cylinders, \nwas created in " + this.creationYear + ", and has a capacity of " + this.passengerCapacity + " people.";
    }

    
    
    /** 
     * @param x
     * @return boolean
     */
    public boolean equals(Object x){
        if (x != null){
            String otherClass = x.getClass().toString().substring(13);
            if (otherClass.equals("Helicopter")){
                Helicopter otherHelicopter = new Helicopter((Helicopter) x);
                if (otherHelicopter.getBrand().equals(this.getBrand()) && otherHelicopter.getPrice() == this.getPrice() && otherHelicopter.getHorsepower() == this.getHorsepower()
                && otherHelicopter.getNumOfCylinders() == this.numOfCylinders && otherHelicopter.getCreationYear() == this.creationYear
                && otherHelicopter.getPassengerCapacity() == this.passengerCapacity){
                    return true;
                }
            }
        }
        return false;
    }
    
}

