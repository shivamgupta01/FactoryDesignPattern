package factoryDesignPattern.WithClass;

public class CarFactoryWithClass {
    private String model;
    private String bhp;
    private String color;

    public CarFactoryWithClass(String model) {
        this.model = model;
        this.bhp = null;
        this.color = null;
    }

    public CarFactoryWithClass(String model, String bhp, String color) {

        this.model = model;
        this.bhp = bhp;
        this.color = color;
    }

    public CarFactoryWithClass(){}

    public Car getCar()
    {
        if (BMW.equals(model)) {
            return new BMW(model, bhp, color);
        } else if (Audi.equals(model)) {
            return new Audi(model, bhp, color);
        } else {
            return new Car(model, bhp, color);
        }
    }

    private static final String BMW = "BMW";
    private static final String Audi = "Audi";
}
