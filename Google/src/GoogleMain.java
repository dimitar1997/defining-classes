import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoogleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> names = new HashMap<>();
        while (true){
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            if (name.equals("End")) break;
            String command = tokens[1];

            Company company;
            Pokemon pokemon;
            Parents parents;
            Children children;
            Car car;
            if (!names.containsKey(name)){
                names.put(name, new Person());
            }
            switch (command){
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    company = new Company(companyName, department, salary);
                    names.get(name).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    pokemon = new Pokemon(pokemonName, pokemonType);
                    names.get(name).setPokemons(pokemon);
                    break;
                case "parents":
                  String parentName = tokens[2];
                  String parentBirthday = tokens[3];
                  parents = new Parents(parentName, parentBirthday);
                    names.get(name).setParents(parents);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    children = new Children(childName, childBirthday);
                    names.get(name).setChildren(children);
                    break;
                case "car":
                    String carModel = tokens[2];
                    int speed = Integer.parseInt(tokens[3]);
                    car = new Car(carModel, speed);
                    names.get(name).setCar(car);
                    break;
            }

        }
        String nameOutput = scanner.nextLine();

        System.out.println(nameOutput);
        if (!names.get(nameOutput).checkNull(names.get(nameOutput).getCompany())){
            System.out.println("Company:");
        }else {
            System.out.println("Company:");
            System.out.println(names.get(nameOutput).getCompany().getCompanyName());
        }
    }
}
