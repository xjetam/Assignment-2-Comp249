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


    
    /** 
     * @return int
     */
    public int getMaxFlyingSpeed(){
        return this.maxFlyingSpeed;
    }

    
    /** 
     * @param maxFlyingSpeed
     */
    public void setMaxFlyingSpeed(int maxFlyingSpeed){
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "This quadcopter is manufactured by " + this.getBrand() + ", costs $" + this.getPrice() + ", has " + this.getHorsepower()+ " horsepower, "
        + "has " + this.getNumOfCylinders() + " cylinders, \nwas created in " + this.getCreationYear() + ", has a capacity of " + this.getPassengerCapacity() + " people, "
        + "and has a maximum flying speed of " + this.maxFlyingSpeed + " kilometers per hour.";
    }

    
    /** 
     * @param x
     * @return boolean
     */
    public boolean equals(Object x){
        if (x != null){
            String otherClass = x.getClass().toString().substring(13);
            if (otherClass.equals("Quadcopter")){
                Quadcopter otherQuadcopter = new Quadcopter((Quadcopter) x);
                if (otherQuadcopter.getBrand().equals(this.getBrand()) && otherQuadcopter.getPrice() == this.getPrice() && otherQuadcopter.getHorsepower() == this.getHorsepower()
                && otherQuadcopter.getNumOfCylinders() == this.getNumOfCylinders() && otherQuadcopter.getCreationYear() == this.getCreationYear()
                && otherQuadcopter.getPassengerCapacity() == this.getPassengerCapacity() && otherQuadcopter.getMaxFlyingSpeed() == this.maxFlyingSpeed){
                    return true;
                }
            }
        }
        return false;
    }
    
}
