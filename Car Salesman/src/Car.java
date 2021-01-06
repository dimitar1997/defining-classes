public class Car {
    private String model;
    private String engineModel;
    private int weight = 0;
    private String color = "n/a";

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public String getModel() {
        return model;
    }

    public Car(String model, String engineModel, String color) {
        this.model = model;
        this.engineModel = engineModel;
        this.color = color;
    }

    public Car(String model, String engineModel) {
        this.model = model;
        this.engineModel = engineModel;
    }

    public Car(String model, String engineModel, int weight) {
        this.model = model;
        this.engineModel = engineModel;
        this.weight = weight;
    }

    public Car(String model, String engineModel, int weight, String color) {
        this.model = model;
        this.engineModel = engineModel;
        this.weight = weight;
        this.color = color;
    }
}
