package FlyingObjects;
/**
 * Assignment 2
 * For COMP  249 Section D - Fall 2022
 * @author Linden Wheeler 40195748 and Matej Pederson 40209550
 */
public class FlyingObjects {

    private static int objectCounter = 0;
    private int objectNumber;
    /**
     * Default constructor.
     */
    public FlyingObjects(){
        objectNumber = objectCounter;
        objectCounter++;
    }
    /**
     * Copy constructor.
     * 
     * @param object object that is the copy
     */
    public FlyingObjects(FlyingObjects object){
        objectNumber = objectCounter;
        objectCounter++;
    }

    
    /** 
     * @return int object number of the flying object
     */
    public int getObjectNumber(){
        return this.objectNumber;
    }
    
    
    /** 
     * @return String info of flying object
     */
    public String toString(){
        return "Flying Object with object number: " + this.objectNumber + ". ";
    }
    
}
