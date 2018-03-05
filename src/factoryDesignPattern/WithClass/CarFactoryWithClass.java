package factoryDesignPattern.WithClass;

public class CarFactoryWithClass {
    private String model;

    public CarFactoryWithClass(String model) {
        this.model = model;
    }

    public Car getCar()
    {
        if (BMW.equals(model)) {
            return new BMW(model);
        } else if (Audi.equals(model)) {
            return new Audi(model, null, null);
        } else {
            return new Car(model, null, null);
        }
    }

    private static final String BMW = "BMW";
    private static final String Audi = "Audi";
}
