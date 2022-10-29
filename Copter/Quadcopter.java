package Copter;

public class Quadcopter extends Helicopter{

    private int maxFlyingSpeed;

    /**
     * Default constructor.
     */
    public Quadcopter(){
        this.maxFlyingSpeed = 0;
        //System.out.println("Default constructor Quadcopter");
    }
    /**
     * Constructor that takes parameters.
     * 
     * @param brand 
     * @param price
     * @param horsepower
     * @param numOfCylinders
     * @param creationYear
     * @param passengerCapacity
     * @param maxFlyingSpeed
     */
    public Quadcopter(String brand, double price, int horsepower, int numOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed){
        super(brand, price, horsepower, numOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
        //System.out.println("Paramatized constructor Quadcopter");
    }
    /**
     * Copy constructor.
     * 
     * @param quadcopter object that is the copy
     */
    public Quadcopter(Quadcopter quadcopter){
        super(quadcopter);
        this.maxFlyingSpeed = quadcopter.getMaxFlyingSpeed();
        //System.out.println("Copy constructor Quadcopter");
    }


    
    /** 
     * @return int max flying speed of object
     */
    public int getMaxFlyingSpeed(){
        return this.maxFlyingSpeed;
    }

    
    /** 
     * sets max flying speed
     * @param maxFlyingSpeed
     */
    public void setMaxFlyingSpeed(int maxFlyingSpeed){
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    
    /** 
     * Prints out all the info of the object
     * @return String
     */
    public String toString(){
        return "This quadcopter is manufactured by " + this.getBrand() + ", costs $" + this.getPrice() + ", has " + this.getHorsepower()+ " horsepower, "
        + "has " + this.getNumOfCylinders() + " cylinders, \nwas created in " + this.getCreationYear() + ", has a capacity of " + this.getPassengerCapacity() + " people, "
        + "and has a maximum flying speed of " + this.maxFlyingSpeed + " kilometers per hour.";
    }

    
    /** 
     * Checks if two objects are equal
     * @param x object to compare
     * @return boolean true if equal false if not
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
