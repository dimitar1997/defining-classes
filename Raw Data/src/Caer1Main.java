import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Caer1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Tire> fragile1 = new LinkedHashMap<>();
        Map<String, Engine> flamable1 = new LinkedHashMap<>();
          int n = Integer.parseInt(scanner.nextLine());
          Car1 car1 = null;
          Tire tire = null;
          Cargo cargo = null;
          Engine engine = null;
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            int speed = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);
            int weight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            tire = new Tire(Double.parseDouble(tokens[5]), Integer.parseInt(tokens[6]),
                    Double.parseDouble(tokens[7]), Integer.parseInt(tokens[8]),
                    Double.parseDouble(tokens[9]), Integer.parseInt(tokens[10]),
                    Double.parseDouble(tokens[11]), Integer.parseInt(tokens[12]));
            engine = new Engine(speed, power);
            cargo = new Cargo(cargoType, weight);
            car1 = new Car1(model, engine, cargo, tire);
            fragile1.put(model, tire);
            flamable1.put(model, engine);
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")){
            fragile1.forEach((key, value) -> {
                if (value.getTire1Pressure() < 1 || value.getTire2Pressure() < 1
                        || value.getTire3Pressure() < 1 || value.getTire4Pressure() < 1) {
                    System.out.printf("%s%n", key);

                }
            });

        }else if (command.equals("flamable")){
             flamable1.forEach((key, value) -> {
                 if (value.getEnginePower() > 250) {
                     System.out.printf("%s%n", key);
                 }
             });
        }
    }
}
