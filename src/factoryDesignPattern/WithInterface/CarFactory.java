package factoryDesignPattern.WithInterface;

import java.util.Arrays;
import java.util.List;

public class CarFactory {
    private String model;
    private String color;
    private String bhp;

    private static final String BMW = "BMW";
    private static final String Audi = "Audi";

    public CarFactory(String model, String color, String bhp)
    {
        if (getModelList().contains(model))
        {
            this.model = model;
        }
        else
        {
            this.model = null;
        }

        this.bhp = bhp;
        this.color = color;
    }

    public CarFactory(String model)
    {
        if (getModelList().contains(model))
        {
            this.model = model;
        }
        else
        {
            this.model = null;
        }
    }

    public String getCarColor()
    {
        String localColorVariable;

        if (BMW.equals(model))
        {
            BMW newBMW = new BMW(color, model, bhp);
            localColorVariable = newBMW.getCarColor();
        }
        else if (Audi.equals(model))
        {
            Audi newAudi = new Audi(model, Integer.parseInt(bhp));
            localColorVariable = newAudi.getCarColor();
        }
        else
        {
            Default defaultCar = new Default(color);
            localColorVariable = defaultCar.getCarColor();
        }

        String printColorVariable = String.format("Color of %s = %s", model, localColorVariable);
        System.out.println(printColorVariable);
        return localColorVariable;
    }

    public String getBhp()
    {
        String localBhpVariable;

        //  if (model.equals("BMW")) not valid and it will NullPointerException

        if (BMW.equals(model))
        {
            BMW newBMW = new BMW(color, model, bhp);
            localBhpVariable = newBMW.getBHP();
        }
        else if (Audi.equals(model))
        {
            Audi newAudi = new Audi(model, Integer.parseInt(bhp));
            localBhpVariable = newAudi.getBHP();
            if (newAudi.isSuperCar())
            {
                System.out.println("It is a super car");
            }
            else
            {
                System.out.println("It is not a super car");
            }
        }
        else
        {
            Default defaultCar = new Default(color);
            localBhpVariable = defaultCar.getBHP();
            model = defaultCar.getCarModel();
        }

        String printBhp = String.format("BHP of %s = %s", model, localBhpVariable);
        System.out.println(printBhp);
        return localBhpVariable;
    }

    private List<String> getModelList()
    {
        return Arrays.asList(Audi, BMW);
    }
}
