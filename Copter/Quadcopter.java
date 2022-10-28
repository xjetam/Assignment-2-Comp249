package Copter;

public class Quadcopter extends Helicopter{

    private int maxFlyingSpeed;


    public Quadcopter(){
        this.maxFlyingSpeed = 0;
        System.out.println("Default constructor Quadcopter");
    }

    public Quadcopter(String brand, double price, int horsepower, int numOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed){
        super(brand, price, horsepower, numOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
        System.out.println("Paramatized constructor Quadcopter");
    }

    public Quadcopter(Quadcopter quadcopter){
        super(quadcopter);
        this.maxFlyingSpeed = quadcopter.getMaxFlyingSpeed();
        System.out.println("Copy constructor Quadcopter");
    }


    public int getMaxFlyingSpeed(){
        return this.maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed){
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public String toString(){
        return "This quadcopter is manufactured by " + this.getBrand() + ", costs $" + this.getPrice() + ", has " + this.getHorsepower()+ " horsepower, "
        + "has " + this.getNumOfCylinders() + " cylinders, \nwas created in " + this.getCreationYear() + ", has a capacity of " + this.getPassengerCapacity() + " people, "
        + "and has a maximum flying speed of " + this.maxFlyingSpeed + " kilometers per hour.";
    }
    
}
