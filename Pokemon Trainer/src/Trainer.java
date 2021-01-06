import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int numbersOfBadges;
    private List<Pokemon> pokemons;

    public int getNumbersOfBadges() {
        return numbersOfBadges;
    }

    public void setNumbersOfBadges() {
        this.numbersOfBadges++;
    }

    public Trainer() {
        this.numbersOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public List<Pokemon> getPokemon() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }
}
