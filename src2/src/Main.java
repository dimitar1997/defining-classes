import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            Car car;
            if (tokens.length == 3){
                car = new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
                System.out.println(car.toString());
            }else if (tokens.length == 2){
                car = new Car(tokens[0], tokens[1]);
                System.out.println(car.toString());
            }else {
                car = new Car(tokens[0]);
                System.out.println(car.toString());
            }
        }
    }
}
