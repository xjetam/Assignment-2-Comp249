package DroneMAV;

import UAV.UAV;
/**
 * Assignment 2
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 */
public class MAV extends UAV{

    private String model;
    private double size;
    /**
     * Default constructor.
     */
    public MAV(){
        this.model = "No model";
        this.size = 0;
        //System.out.println("Default constructor MAV");
    }
    /**
     * Constructor that takes parameters.
     * 
     * @param weight brand of MAV
     * @param price price of MAV
     * @param model horsepower of MAV
     * @param size size of MAV
     */
    public MAV(double weight, double price, String model, double size){
        super(weight, price);

        this.model = model;
        this.size = size;
        //System.out.println("Paramatized constructor MAV");
    }
    /**
     * Copy constructor.
     * 
     * @param mav object that is the copy
     */
    public MAV(MAV mav){
        super(mav);
        
        this.model = mav.getModel();
        this.size = mav.getSize();
        //System.out.println("Copy constructor MAV");
    }

    
    /** 
     * returns the model of MAV
     * @return String model of MAV
     */
    public String getModel(){
        return this.model;
    }

    
    /** 
     * returns the size of MAV
     * @return double size of MAV
     */
    public double getSize(){
        return this.size;
    }


    
    /** 
     * sets the model of MAV
     * @param model model of MAV
     */
    public void setModel(String model){
        this.model = model;
    }

    
    /** 
     * sets the size of MAV
     * @param size size of MAV
     */
    public void setModel(double size){
        this.size = size;
    }

    
    /** 
     * returns information of the MAV
     * @return String MAV info
     */
    public String toString(){
        return "Flying object number " + this.getObjectNumber() + ". " + "This MAV weighs " + this.getWeight() + ", costs $" + this.getPrice() + ", is the " + this.model +
        " model, and is " + this.size + " meters across.";
    }

    
    /** 
     * Checks if two objects are equal
     * @param x plane to compare
     * @return boolean true if equal false if not
     */
    public boolean equals(Object x){
        if (x != null){
            String otherClass = x.getClass().toString().substring(15);
            if (otherClass.equals("MAV")){
                MAV otherMAV = new MAV((MAV) x);
                if (otherMAV.getWeight() == this.getWeight() && otherMAV.getPrice() == this.getPrice() && otherMAV.getModel().equals(this.model)
                && otherMAV.getSize() == this.size){
                    return true;
                }
            }
        }
        return false;
    }

}
