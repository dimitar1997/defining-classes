public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1km;
    private double distanceTravel = 0;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostFor1km() {
        return fuelCostFor1km;
    }

    public void setFuelCostFor1km(double fuelCostFor1km) {
        this.fuelCostFor1km = fuelCostFor1km;
    }

    public double getDistanceTravel() {
        return distanceTravel;
    }

    public void setDistanceTravel(double distanceTravel) {
        this.distanceTravel = distanceTravel;
    }

    public Car(String model, double fuelAmount, double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
    }

    public void reduce(double amountOfKM) {
        if (check(amountOfKM)){
            this.distanceTravel = this.distanceTravel +  amountOfKM;
            this.fuelAmount = this.fuelAmount - (amountOfKM * this.fuelCostFor1km);
        }


    }

    public boolean check(double amountOfKM){
        boolean check = true;
        double checkFuel = this.fuelAmount - (amountOfKM * this.fuelCostFor1km);
        if (checkFuel < 0){
            check = false;
            System.out.println("Insufficient fuel for the drive");
        }
        return check;
    }

}
