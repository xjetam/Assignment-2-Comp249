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
     * @param weight weight of object
     * @param price price of object
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
     * returns the weight of object
     * @return double weight of object
     */
    public double getWeight(){
        return this.weight;
    }

    
    /** 
     * returns the price of object
     * @return double price of object
     */
    public double getPrice(){
        return this.price;
    }

    
    /** 
     * sets weight of object
     * @param weight weight of object
     */
    public void setWeight(int weight){
        this.weight = weight;
    }

    
    /** 
     * sets price of object
     * @param price price of object
     */
    public void setPrice(int price){
        this.price = price;
    }

    
    /** 
     * returns all information of the UAV
     * @return String info of the UAV
     */
    public String toString(){
        return "This UAV weighs " + this.weight + ", and costs $" + this.price + ".";
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
