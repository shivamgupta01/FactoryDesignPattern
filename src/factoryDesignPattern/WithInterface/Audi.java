package factoryDesignPattern.WithInterface;

import factoryDesignPattern.ICar;

public class Audi implements ICar {
    private String carModel;
    private int carBHP;

    public Audi(String carModel, int carBHP){
    this.carModel=carModel;
    this.carBHP=carBHP;
    }
    @Override
    public String getCarColor() {
        return "BLACK"; // Always black
    }

    @Override
    public String getCarModel() {
        return carModel;
    }

    @Override
    public String getBHP() {
        return String.valueOf(carBHP);
    }

    public boolean isSuperCar()
    {
        if (carBHP > 400)
        {
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }
    }
}
