package DroneMAV;

import UAV.UAV;

public class MAV extends UAV{

    private String model;
    private double size;
    
    public MAV(){
        this.model = "No model";
        this.size = 0;
        System.out.println("Default constructor MAV");
    }

    public MAV(double weight, double price, String model, double size){
        super(weight, price);

        this.model = model;
        this.size = size;
        System.out.println("Paramatized constructor MAV");
    }

    public MAV(MAV mav){
        super(mav);
        
        this.model = mav.getModel();
        this.size = mav.getSize();
        System.out.println("Copy constructor MAV");
    }

    
    /** 
     * @return String
     */
    public String getModel(){
        return this.model;
    }

    
    /** 
     * @return double
     */
    public double getSize(){
        return this.size;
    }


    
    /** 
     * @param model
     */
    public void setModel(String model){
        this.model = model;
    }

    
    /** 
     * @param size
     */
    public void setModel(double size){
        this.size = size;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "This MAV weighs " + this.getWeight() + ", costs $" + this.getPrice() + ", is the " + this.model +
        " model, and is " + this.size + " meters across.";
    }

    
    /** 
     * @param x
     * @return boolean
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
