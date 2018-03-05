package factoryDesignPattern.WithClass;

public class CarFactoryWithClass {
    private String model;
    private String bhp;
    private String color;

    public CarFactoryWithClass(FactoryBuilder builder) {
        this.model = builder.model;
        this.bhp = builder.bhp;
        this.color = builder.color;
    }

    public String getModel() {
        return model;
    }

    public String getBhp() {
        return bhp;
    }

    public String getColor() {
        return color;
    }

    public Car getCar() {
        if (BMW.equals(model)) {
            return new BMW(model, bhp, color);
        } else if (Audi.equals(model)) {
            return new Audi(model, bhp, color);
        } else {
            return new Car(model, bhp, color);
        }
    }

    public static class FactoryBuilder {
        private String model;
        private String bhp;
        private String color;

        public FactoryBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public FactoryBuilder setBhp(String bhp) {
            this.bhp = bhp;
            return this;
        }

        public FactoryBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarFactoryWithClass build()
        {
            return new CarFactoryWithClass(this);
        }
    }

    private static final String BMW = "BMW";
    private static final String Audi = "Audi";
}
