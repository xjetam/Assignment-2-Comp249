package DroneMAV;

import UAV.UAV;
/**
 * Assignment 2
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 */
public class AgriculturalDrone extends UAV{

    private String brand;
    private int carryCapacity;
    
    /**
     * Default constructor.
     */
    public AgriculturalDrone(){
        this.brand = "No brand";
        this.carryCapacity = 0;
        //System.out.println("Default constructor AgriculturalDrone");
    }
    /**
     * Constructor that takes parameters.
     * 
     * @param weight weight of object
     * @param price price of object
     * @param brand brand of object
     * @param carryCapacity carry capacity of object
     */
    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity){
        super(weight, price);

        this.brand = brand;
        this.carryCapacity = carryCapacity;
        //System.out.println("Paramatized constructor AgriculturalDrone");
    }
    /**
     * Copy constructor.
     * 
     * @param agroDrone object that is the copy
     */
    public AgriculturalDrone(AgriculturalDrone agroDrone){
        super(agroDrone);
        
        this.brand = agroDrone.getBrand();
        this.carryCapacity = agroDrone.getCarryCapacity();
        //System.out.println("Copy constructor AgriculturalDrone");
    }

    
    /** 
     * returns brand of the object
     * @return String brand of object
     */
    public String getBrand(){
        return this.brand;
    }

    
    /** 
     * returns the carrying capacity of the object
     * @return int get carry capacity
     */
    public int getCarryCapacity(){
        return this.carryCapacity;
    }


    
    /** 
     * sets the brand of the AD
     * @param brand brand of the object
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    
    /** 
     * sets the carry capacity of the object
     * @param carryCapacity carry capacity of the object
     */
    public void setCarryCapacity(int carryCapacity){
        this.carryCapacity = carryCapacity;
    }

    
    /** 
     * returns the information of the AD
     * @return String info of the AD
     */
    public String toString(){
        return "Flying object number " + this.getObjectNumber() + ". " + "This agricultural drone weighs " + this.getWeight() + " kilograms, costs $" + this.getPrice() + 
        ", is made by " + this.brand + ", and can carry up to " + this.carryCapacity + " kilograms";
    }

    
    /** 
     * @param x object that is being compared
     * @return boolean true if equal false if not
     */
    public boolean equals(Object x){
        if (x != null){
            String otherClass = x.getClass().toString().substring(15);
            if (otherClass.equals("AgriculturalDrone")){
                AgriculturalDrone otherAgriculturalDrone = new AgriculturalDrone((AgriculturalDrone) x);
                if (otherAgriculturalDrone.getWeight() == this.getWeight() && otherAgriculturalDrone.getPrice() == this.getPrice() && otherAgriculturalDrone.getBrand().equals(this.brand)
                && otherAgriculturalDrone.getCarryCapacity() == this.carryCapacity){
                    return true;
                }
            }
        }
        return false;
    }

}
