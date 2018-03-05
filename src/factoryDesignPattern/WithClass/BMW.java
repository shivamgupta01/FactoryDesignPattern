package factoryDesignPattern.WithClass;

public class BMW extends Car
{
    private String color;

    public BMW(String model, String bhp, String color)
    {
        // Super should be the first statement in the constructor.
        super(model, bhp, color);
        this.color = color;
    }

    public BMW(String model)
    {
        super(model, null, null);
        this.color = null;
    }

    @Override
    public String getCarColor()
    {
        String defaultColor = "MAGENTA";

        if (null == color)
        {
            return defaultColor;
        }

        if ("RED".equals(color))
        {
            return "DARK_RED";
        }
        else if ("BLUE".equals(color))
        {
            return "DARK_BLUE";
        }
        else
        {
            return color;
        }
    }
}
