public class Pokemon {
    private String pokName;
    private String element;
    private int health;

    public Pokemon(String pokName, String element, int health) {
        this.pokName = pokName;
        this.element = element;
        this.health = health;
    }

    public int setHealth(int health) {
        return health;
    }

    public int getHealth() {
        return health;
    }

    public String getElement() {
        return element;
    }
}
