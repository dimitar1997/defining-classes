import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PokemonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pokemon pokemon = null;
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        while (true){
            String[] tokens = scanner.nextLine().split(" ");
            if (tokens[0].equals("Tournament")) break;
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);
            pokemon = new Pokemon(pokemonName, element, health);

            if (!trainers.containsKey(trainerName)){
                trainers.put(trainerName, new Trainer());
                trainers.get(trainerName).addPokemon(pokemon);
            }else {
                trainers.get(trainerName).addPokemon(pokemon);
            }
        }
        while (true){
            String command = scanner.nextLine();
            if (command.equals("End")) break;
            for (Map.Entry<String, Trainer> kvp: trainers.entrySet()) {
                if (kvp.getValue().getPokemon().size() > 0){
                    for (Pokemon pokemon1 : kvp.getValue().getPokemon()) {
                        if (pokemon1.getElement().equals(command)) {
                            kvp.getValue().setNumbersOfBadges();
                        }else {
                            int newHealth = pokemon1.getHealth() - 10;
                            pokemon1.setHealth(newHealth);
                            if (pokemon1.getHealth() <= 0){
                                kvp.getValue().getPokemon().remove(pokemon1);
                            }
                        }
                    }
                }
            }
        }
        trainers.entrySet().stream().sorted((a1, a2) ->
                Integer.compare(a2.getValue().getNumbersOfBadges(), a1.getValue().getNumbersOfBadges()))
                .forEach(entry ->
                        System.out.println(entry.getKey() + " " + entry.getValue().getNumbersOfBadges()
                                + " " + entry.getValue().getPokemon().size()));
    }
}
