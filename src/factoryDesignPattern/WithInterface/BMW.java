package factoryDesignPattern.WithInterface;

import factoryDesignPattern.ICar;

public class BMW implements ICar
{
    public BMW(String carColor, String carModel, String carBHP)
    {
        if (null == carBHP)
        {
            this.carBHP = "200"; // default BHP
        }
        else
        {
            this.carBHP = carBHP;
        }

        if (null == carColor)
        {
            this.carColor = "BLACK";
        }
        else if (carColor.equals("RED"))
        {
            this.carColor = "DARK_RED";
        }
        else
        {
            this.carColor = carColor;
        }

        this.carModel = carModel;
    }

    @Override
    public String getCarColor() {
        return carColor;
    }

    @Override
    public String getCarModel() {
        return carModel;
    }

    @Override
    public String getBHP() {
        return carBHP;
    }


    private String carColor;
    private String carModel;
    private String carBHP;
}
