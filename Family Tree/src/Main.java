import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    private static Person getPerson(String token,
                                    HashMap<String, Person> indexByName, HashMap<String, Person> indexByDate) {

        Person result = null;
        if (token.contains("/")) {
            result = indexByDate.get(token);
            if (result == null) {
                result = new Person();
                result.setDate(token);
                indexByDate.put(token, result);
            }
        } else {
            result = indexByName.get(token);
            if (result == null) {
                result = new Person();
                result.setName(token);
                indexByName.put(token, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String searchPerson = sc.nextLine();
        List<String> lines = new ArrayList<>();
        while (true) {
            String line = sc.nextLine();
            if ("End".equals(line)) break;
            lines.add(line);
        }
        HashMap<String, Person> indexByName = new HashMap<>();
        HashMap<String, Person> indexByDate = new HashMap<>();
        for(String line: lines){
            if (line.contains("-")) continue;
            int pos = line.lastIndexOf(" ");
            String name = line.substring(0, pos);
            String date = line.substring(pos + 1);
            Person person = new Person();
            person.setName(name);
            person.setDate(date);
            indexByName.put(name, person);
            indexByDate.put(date, person);
        }
        for(String line: lines){
            if (!line.contains("-")) continue;
            String[] token = line.split(" - ");
            Person parent = getPerson(token[0], indexByName, indexByDate);
            Person child = getPerson(token[1], indexByName, indexByDate);
            parent.children.add(child);
            child.parents.add(parent);
        }
        Person person;
        if (searchPerson.contains("/")) person = indexByDate.get(searchPerson);
        else person = indexByName.get(searchPerson);
        System.out.println(person);

    }

}
