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

    public String getBrand(){
        return this.brand;
    }

    public int getCarryCapacity(){
        return this.carryCapacity;
    }


    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setCarryCapacity(int carryCapacity){
        this.carryCapacity = carryCapacity;
    }
}
