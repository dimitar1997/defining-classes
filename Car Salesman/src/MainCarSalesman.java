import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCarSalesman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Engine engine;
            if (tokens.length == 4){
                int displacements = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];
                engine = new Engine(model, power,displacements, efficiency );
            }else if (tokens.length == 2){
                engine = new Engine(model, power);
            }else {
                try {
                    int displacements = Integer.parseInt(tokens[2]);
                    engine = new Engine(model, power, displacements);
                }catch (NumberFormatException e){
                    String efficiency = tokens[2];
                    engine = new Engine(model, power, efficiency);
                }
            }
            engines.add(engine);
        }

        int m = Integer.parseInt(scanner.nextLine());
     List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m ; i++) {
           String[] tokens = scanner.nextLine().split(" ");
           String model = tokens[0];
           String engineModel = tokens[1];
           Car car;
           if (tokens.length == 4){
               int weight = Integer.parseInt(tokens[2]);
               String color = tokens[3];
               car = new Car(model, engineModel, weight, color);
           }else if (tokens.length == 2){
               car = new Car(model, engineModel);
           }else {
               try {
                   int weight = Integer.parseInt(tokens[2]);
                   car = new Car(model, engineModel, weight);
               } catch ( NumberFormatException e){
                   String color = tokens[2];
                   car = new Car(model, engineModel, color);
               }
           }
           cars.add(car);
        }

        for (Car car: cars) {
            System.out.println(car.getModel() + ":");
            System.out.println(car.getEngineModel() + ":");
            engines.forEach(engine -> {
                if (engine.getModel().equals(car.getEngineModel())){
                    System.out.println("Power: " + engine.getPower());
                    if (engine.getDisplacements() == 0){
                        System.out.println("Displacement: n/a");
                    }else {
                        System.out.println("Displacement: " +engine.getDisplacements());
                    }
                    System.out.println("Efficiency: " + engine.getEfficiency());
                    if (car.getWeight() == 0){
                        System.out.println("Weight: n/a");
                    }else {
                        System.out.println("Weight: " + car.getWeight());
                    }
                    System.out.print("Color: " + car.getColor());
                }
            });
            System.out.println();
        }
    }
}
