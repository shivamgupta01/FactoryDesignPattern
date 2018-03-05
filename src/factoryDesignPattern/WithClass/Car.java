package factoryDesignPattern.WithClass;

import factoryDesignPattern.ICar;

public class Car implements ICar
{

    private String model;
    private String bhp;
    private String color;

    // It is not a public constructor so you cannot create an instance of this class.
    Car(String model, String bhp, String color)
    {
        this.model = model;
        this.bhp = bhp;
        this.color = color;
    }

    @Override
    public String getCarColor()
    {
        String defaultColor = "ORANGE";
        if (null == color)
        {
            return defaultColor;
        }
        return color;
    }

    @Override
    public String getCarModel()
    {
        if (null == model)
        {
            return "HONDA CIVIC";
        }
        else
        {
            return model;
        }
    }

    @Override
    public String getBHP() {
        if (null == bhp)
        {
            return "200";
        }
        else
        {
            return bhp;
        }
    }
}
