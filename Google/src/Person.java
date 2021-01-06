import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parents> parents;
    private List<Children> children;
    private Car car;
public Person(){
    this.pokemons = new ArrayList<>();
    this.parents = new ArrayList<>();
    this.children = new ArrayList<>();
}

      public boolean checkNull(Company company) {
    boolean ch = true;
       if (company == null){
           ch = false;
       }
       return ch;
    }
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon pokemon) {

        this.pokemons.add(pokemon);
    }

    public List<Parents> getParents() {
        return parents;
    }

    public void setParents(Parents parent) {
        this.parents.add(parent);
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(Children child) {
        this.children.add(child);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
