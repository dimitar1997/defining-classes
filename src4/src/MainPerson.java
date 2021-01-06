import java.util.Comparator;
import java.util.Scanner;

import java.util.stream.Stream;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = Integer.parseInt(scanner.nextLine());
        final Person [] persons = new Person [n];
        for (int i = 0; i < n; i++){
            final String[] tokens = scanner.nextLine().split(" ");
            final String name = tokens[0];
            final int age = Integer.parseInt(tokens[1]);
//            persons[i] = new Person();
//            persons[i].setName(name);
//            persons[i].setAge(age);
            persons[i] = new Person(name,age);
        }
        Stream.of(persons)
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.println(person.toString()));
    }
}
