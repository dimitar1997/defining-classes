import java.util.*;

public class CarMAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> output = new LinkedHashMap<>();
        Car car = null;
        for (int i = 1; i <= n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            double amount = Double.parseDouble(tokens[1]);
            double cost1km = Double.parseDouble(tokens[2]);
            car = new Car(model, amount, cost1km);
            output.put(model, car);
        }
        while (true) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            if (command.equals("End")) break;

            if (command.equals("Drive")) {
                String carName = tokens[1];
                double amoutOfKm = Double.parseDouble(tokens[2]);

                output.get(carName).reduce(amoutOfKm);
                
            }
        }
        output.forEach((key, value) -> System.out.printf("%s %.2f %.0f%n",
                value.getModel(), value.getFuelAmount()
                , value.getDistanceTravel()));

    }
}
