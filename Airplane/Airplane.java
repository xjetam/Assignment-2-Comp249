package Airplane;

import FlyingObjects.FlyingObjects;

/**
 * Assignment 2
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 * @version
 */
public class Airplane extends FlyingObjects{
    
    private String brand;
    private double price;
    private int horsepower;

    /**
     * Default constructor.
     */
    public Airplane(){
        this.brand = "No brand";
        this.price = 0;
        this.horsepower = 0;
        //System.out.println("Default constructor Airplane");
    }
    /**
     * Constructor that takes parameters.
     * 
     * @param brand brand of object
     * @param price price of object
     * @param horsepower horsepower of object
     */
    public Airplane(String brand, double price, int horsepower){
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
        //System.out.println("Paramatized constructor Airplane");
    }
    /**
     * Copy constructor.
     * 
     * @param airplane object that is the copy
     */
    public Airplane(Airplane airplane){
        this.brand = airplane.getBrand();
        this.price = airplane.getPrice();
        this.horsepower = airplane.getHorsepower();
        //System.out.println("Copy constructor Airplane");
    }


    
    /** 
     * returns brand of object
     * @return String brand of object
     */
    public String getBrand(){
        return this.brand;
    }

    
    /** 
     * @return double price of object
     */
    public double getPrice(){
        return this.price;
    }

    
    /** 
     * @return int horsepower of object
     */
    public int getHorsepower(){
        return this.horsepower;
    }


    
    /** 
     * sets brand of object
     * @param brand brand of object
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    
    /** 
     * sets price of object
     * @param price price of object
     */
    public void setPrice(double price){
        this.price = price;
    }

    
    /** 
     * sets horsepower of object
     * @param horsepower horsepower of the quadcopter
     */
    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }

    
    /** 
     * Prints out all the info of the plane
     * @return String info of airplane
     */
    public String toString(){
        return "This airplane is manufactured by " + this.brand + ", costs $" + this.price + ", and has " + this.horsepower + " horsepower.";
    }
    
    
    /** 
     * Checks if two objects are equal
     * @param x plane to compare
     * @return boolean true if equal false if not
     */
    public boolean equals(Object x){
        if (x != null){
            String otherClass = x.getClass().toString().substring(15);
            if (otherClass.equals("Airplane")){
                Airplane otherAirplane = new Airplane((Airplane) x);
                if (otherAirplane.getBrand().equals(this.brand) && otherAirplane.getPrice() == this.price && otherAirplane.getHorsepower() == this.horsepower){
                    return true;
                }
            }
        }
        return false;
    }
    
}

