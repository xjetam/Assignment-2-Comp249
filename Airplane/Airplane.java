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
        System.out.println("Default constructor Airplane");
    }

    public Airplane(String brand, double price, int horsepower){
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
        System.out.println("Paramatized constructor Airplane");
    }

    public Airplane(Airplane airplane){
        this.brand = airplane.getBrand();
        this.price = airplane.getPrice();
        this.horsepower = airplane.getHorsepower();
        System.out.println("Copy constructor Airplane");
    }


    public String getBrand(){
        return this.brand;
    }

    public double getPrice(){
        return this.price;
    }

    public int getHorsepower(){
        return this.horsepower;
    }


    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }

}
