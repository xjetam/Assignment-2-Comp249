package DroneMAV;

import UAV.UAV;

public class MAV extends UAV{

    private String model;
    private double size;
    
    public MAV(){
        this.model = "No model";
        this.size = 0;
    }

    public MAV(double weight, double price, String model, double size){
        super(weight, price);

        this.model = model;
        this.size = size;
    }

    public MAV(MAV mav){
        super(mav.getWeight(), mav.getPrice());
        
        this.model = mav.getModel();
        this.size = mav.getSize();
    }

    public String getModel(){
        return this.model;
    }

    public double getSize(){
        return this.size;
    }


    public void setModel(String model){
        this.model = model;
    }

    public void setModel(double size){
        this.size = size;
    }
}
