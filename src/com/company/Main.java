package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	Car car = new Car();
	int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n ; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            String model = tokens[1];
            int power = Integer.parseInt(tokens[2]);
            System.out.println(car.getInfo(name, model, power));
        }



    }
}
