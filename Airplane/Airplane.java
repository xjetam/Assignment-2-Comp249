package Airplane;

import FlyingObjects.FlyingObjects;

public class Airplane extends FlyingObjects{
    
    private String brand;
    private double price;
    private int horsepower;


    public Airplane(){
        this.brand = "No brand";
        this.price = 0;
        this.horsepower = 0;
        //System.out.println("Default constructor Airplane");
    }

    public Airplane(String brand, double price, int horsepower){
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
        //System.out.println("Paramatized constructor Airplane");
    }

    public Airplane(Airplane airplane){
        this.brand = airplane.getBrand();
        this.price = airplane.getPrice();
        this.horsepower = airplane.getHorsepower();
        //System.out.println("Copy constructor Airplane");
    }


    
    /** 
     * @return String
     */
    public String getBrand(){
        return this.brand;
    }

    
    /** 
     * @return double
     */
    public double getPrice(){
        return this.price;
    }

    
    /** 
     * @return int
     */
    public int getHorsepower(){
        return this.horsepower;
    }


    
    /** 
     * @param brand
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    
    /** 
     * @param price
     */
    public void setPrice(double price){
        this.price = price;
    }

    
    /** 
     * @param horsepower
     */
    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "This airplane is manufactured by " + this.brand + ", costs $" + this.price + ", and has " + this.horsepower + " horsepower.";
    }
    
    
    /** 
     * @param x
     * @return boolean
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
