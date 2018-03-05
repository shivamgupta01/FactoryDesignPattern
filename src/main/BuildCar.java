package main;

import factoryDesignPattern.WithClass.Audi;
import factoryDesignPattern.WithClass.BMW;
import factoryDesignPattern.WithInterface.CarFactory;
import factoryDesignPattern.WithClass.CarFactoryWithClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BuildCar {

    public static void main(String args[])
    {
        //BuildCar.withInterface();
        BuildCar.withClass();
    }

    private static void withInterface()
    {

        String modelBMW = "BMW"; // User wants to buy BMW;
        String modelAudi = "Audi"; // User wants to buy BMW;

        //CarFactory car1 = new CarFactory(modelBMW);
        //CarFactory car2 = new CarFactory(modelBMW, "RED", "200");
        CarFactory car3 = new CarFactory(modelAudi, "RED", "300");
        CarFactory car4 = new CarFactory(modelAudi, "BLUE", "500");
        //CarFactory randomCar = new CarFactory("Toyota", "BLUE", "500");


        //car1.getBhp();
        //car1.getCarColor();

        //car2.getBhp();
        //car2.getCarColor();

        car3.getBhp();
        car3.getCarColor();

        car4.getBhp();
        car4.getCarColor();

        //randomCar.getBhp();
        //randomCar.getCarColor();
    }

    private static void withClass()
    {
        int count = 1;
        for (CarFactoryWithClass car : listOfCarFactory())
        {
            System.out.println("******** Car " + count + "********");
            printCarFacts(car);
            if (car.getCar() instanceof Audi)
            {
                Audi audi = (Audi) car.getCar(); // Typecasting
                System.out.println(audi.isSuperCar() ? "It is a super car" : "Its not a super car");
            }
            count ++;
        }
    }

    private static void printCarFacts(CarFactoryWithClass factory)
    {
        String model = factory.getCar().getCarModel();
        String color = factory.getCar().getCarColor();
        String bhp = factory.getCar().getBHP();

        System.out.println(String.format("Car model=%s, bhp=%s, color=%s", model, bhp, color));
    }

    private static void printCarFacts(CarFactory factory)
    {
        String color = factory.getCarColor();
        String bhp = factory.getBhp();
        System.out.println(String.format("Car bhp=%s, color=%s", bhp, color));
    }

    private static List<CarFactoryWithClass> listOfCarFactory()
    {
        CarFactoryWithClass carFactory = new CarFactoryWithClass("BMW");
        CarFactoryWithClass carFactory1 = new CarFactoryWithClass("Audi");
        CarFactoryWithClass carFactory2 = new CarFactoryWithClass("BMW","500", "RED");
        CarFactoryWithClass carFactory3 = new CarFactoryWithClass("BMW","200", "BLUE");
        CarFactoryWithClass carFactory4 = new CarFactoryWithClass("Audi","500", null);
        CarFactoryWithClass carFactory5 = new CarFactoryWithClass(null ,"500", "YELLOW");

        List<CarFactoryWithClass> list = new ArrayList<>();
        list.add(carFactory);
        list.add(carFactory1);
        list.add(carFactory2);
        list.add(carFactory3);
        list.add(carFactory4);
        list.add(carFactory5);

        return list;
    }
}
