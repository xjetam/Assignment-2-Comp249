package UAV;

import FlyingObjects.FlyingObjects;

public class UAV extends FlyingObjects{
    
    private double weight;
    private double price;

    public UAV(){
        this.weight = 0;
        this.price = 0;
        System.out.println("Default constructor UAV");
    }

    public UAV(double weight, double price){
        this.weight = weight;
        this.price = price;
        System.out.println("Paramatized constructor UAV");
    }

    public UAV(UAV uav){
        this.weight = uav.getWeight();
        this.price = uav.getPrice();
        System.out.println("Copy constructor UAV");
    }

    public double getWeight(){
        return this.weight;
    }

    public double getPrice(){
        return this.price;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String toString(){
        return "This UAV weighs " + this.weight + ", and costs $" + this.price + ".";
    }

}
