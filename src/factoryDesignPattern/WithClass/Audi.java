package factoryDesignPattern.WithClass;

public class Audi extends Car implements ISuperCar
{
    private boolean isCarIsSuperCar;
    private static final int CRITERIA_FOR_SUPER_CAR = 400; // this is how you define constant

    public Audi(String model, String bhp, String color)
    {
        super(model, bhp, color);
        this.isCarIsSuperCar = false;
    }

    public boolean isSuperCar()
    {
        if (null == getBHP())
        {
            return isCarIsSuperCar;
        }

        if (CRITERIA_FOR_SUPER_CAR < Integer.parseInt(getBHP()))
        {
            isCarIsSuperCar = true;
        }
        return isCarIsSuperCar;
    }
}
