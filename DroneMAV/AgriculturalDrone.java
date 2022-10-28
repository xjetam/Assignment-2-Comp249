package DroneMAV;

import UAV.UAV;

public class AgriculturalDrone extends UAV{

    private String brand;
    private int carryCapacity;
    
    public AgriculturalDrone(){
        this.brand = "No brand";
        this.carryCapacity = 0;
        System.out.println("Default constructor AgriculturalDrone");
    }

    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity){
        super(weight, price);

        this.brand = brand;
        this.carryCapacity = carryCapacity;
        System.out.println("Paramatized constructor AgriculturalDrone");
    }

    public AgriculturalDrone(AgriculturalDrone agroDrone){
        super(agroDrone);
        
        this.brand = agroDrone.getBrand();
        this.carryCapacity = agroDrone.getCarryCapacity();
        System.out.println("Copy constructor AgriculturalDrone");
    }

    
    /** 
     * @return String
     */
    public String getBrand(){
        return this.brand;
    }

    
    /** 
     * @return int
     */
    public int getCarryCapacity(){
        return this.carryCapacity;
    }


    
    /** 
     * @param brand
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    
    /** 
     * @param carryCapacity
     */
    public void setCarryCapacity(int carryCapacity){
        this.carryCapacity = carryCapacity;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "This agricultural drone weighs " + this.getWeight() + " kilograms, costs $" + this.getPrice() + 
        ", is made by " + this.brand + ", and can carry up to" + this.carryCapacity + " kilograms";
    }

    
    /** 
     * @param x
     * @return boolean
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
