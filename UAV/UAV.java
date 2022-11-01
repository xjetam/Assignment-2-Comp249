package UAV;

import FlyingObjects.FlyingObjects;
/**
 * Assignment 2
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 */
public class UAV extends FlyingObjects{
    
    private double weight;
    private double price;
    /**
     * Default constructor.
     */
    public UAV(){
        this.weight = 0;
        this.price = 0;
        //System.out.println("Default constructor UAV");
    }
    /**
     * Constructor that takes parameters.
     * 
     * @param weight weight of UAV
     * @param price price of UAV
     */
    public UAV(double weight, double price){
        this.weight = weight;
        this.price = price;
        //System.out.println("Paramatized constructor UAV");
    }
    /**
     * Copy constructor.
     * 
     * @param uav object that is the copy
     */
    public UAV(UAV uav){
        this.weight = uav.getWeight();
        this.price = uav.getPrice();
        //System.out.println("Copy constructor UAV");
    }

    
    /** 
     * returns the weight of UAV
     * @return double weight of UAV
     */
    public double getWeight(){
        return this.weight;
    }

    
    /** 
     * returns the price of UAV
     * @return double price of UAV
     */
    public double getPrice(){
        return this.price;
    }

    
    /** 
     * sets weight of UAV
     * @param weight weight of UAV
     */
    public void setWeight(int weight){
        this.weight = weight;
    }

    
    /** 
     * sets price of UAV
     * @param price price of UAV
     */
    public void setPrice(int price){
        this.price = price;
    }

    
    /** 
     * returns all information of UAV
     * @return String info of UAV
     */
    public String toString(){
        return "Flying object number " + this.getObjectNumber() + ". " + "This UAV weighs " + this.weight + ", and costs $" + this.price + ".";
    }

    
    /** 
     * Checks if two objects are equal
     * @param x plane to compare
     * @return boolean true if equal false if not
     */
    public boolean equals(Object x){
        if (x != null){
            String otherClass = x.getClass().toString().substring(10);
            if (otherClass.equals("UAV")){
                UAV otherUAV = new UAV((UAV) x);
                if (otherUAV.getWeight() == this.weight && otherUAV.getPrice() == this.price){
                    return true;
                }
            }
        }
        return false;
    }

}
