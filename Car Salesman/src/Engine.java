public class Engine {
    private String model;
    private  int power;
    private int displacements = 0;
    private String efficiency = "n/a";

    public int getPower() {
        return power;
    }

    public int getDisplacements() {
        return displacements;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public String getModel() {
        return model;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacements) {
        this.model = model;
        this.power = power;
        this.displacements = displacements;
    }

    public Engine(String model, int power, int displacements, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacements = displacements;
        this.efficiency = efficiency;
    }
}
