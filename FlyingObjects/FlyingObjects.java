package FlyingObjects;

public class FlyingObjects {

    private static int objectCounter = 0;
    private int objectNumber;

    public FlyingObjects(){
        objectNumber = objectCounter;
        objectCounter++;
    }

    public FlyingObjects(FlyingObjects object){
        objectNumber = objectCounter;
        objectCounter++;
    }

    public int getObjectNumber(){
        return this.objectNumber;
    }
    
    public String toString(){
        return "Flying Object with object number: " + this.objectNumber + ". ";
    }
    
}
