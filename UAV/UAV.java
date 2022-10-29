package UAV;

import FlyingObjects.FlyingObjects;

public class UAV extends FlyingObjects{
    
    private double weight;
    private double price;

    public UAV(){
        this.weight = 0;
        this.price = 0;
        //System.out.println("Default constructor UAV");
    }

    public UAV(double weight, double price){
        this.weight = weight;
        this.price = price;
        //System.out.println("Paramatized constructor UAV");
    }

    public UAV(UAV uav){
        this.weight = uav.getWeight();
        this.price = uav.getPrice();
        //System.out.println("Copy constructor UAV");
    }

    
    /** 
     * @return double
     */
    public double getWeight(){
        return this.weight;
    }

    
    /** 
     * @return double
     */
    public double getPrice(){
        return this.price;
    }

    
    /** 
     * @param weight
     */
    public void setWeight(int weight){
        this.weight = weight;
    }

    
    /** 
     * @param price
     */
    public void setPrice(int price){
        this.price = price;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "This UAV weighs " + this.weight + ", and costs $" + this.price + ".";
    }

    
    /** 
     * @param x
     * @return boolean
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
