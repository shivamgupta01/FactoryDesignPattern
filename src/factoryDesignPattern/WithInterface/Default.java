package factoryDesignPattern.WithInterface;

import factoryDesignPattern.ICar;

public class Default implements ICar {
    private String carColor;
    private final String carModel = "HONDA";
    private final String carBHP = "200";

    public Default(String carColor) {
        this.carColor = carColor;
    }
    public String getBHP(){
        return carBHP;
    }
    public String getCarColor(){
        if (carColor.equals("BLUE"))
        {
            carColor="GREEN";
        }
        return carColor;
    }
    public String getCarModel(){
        return carModel;
    }


}

