package FlyingObjects;

public class FlyingObjects {
    private static int objectCounter = 0;
    private int objectNumber;

    public FlyingObjects(){
        this.objectNumber = objectCounter;
        objectCounter++;
    }

    public FlyingObjects(FlyingObjects object){
        this.objectNumber = objectCounter;
        objectCounter++;
    }

    public int getObjectNumber(){
        return this.objectNumber;
    }

    public void setObjectNumber(int objectNumber){
        this.objectNumber = objectNumber;
    }

    
    public String toString(){
        return "Object number: " + objectNumber;
    }
    
    
}
