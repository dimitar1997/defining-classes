import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String date;

    public final List<Person> parents = new ArrayList<>();
    public final List<Person> children = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(date);
        sb.append("\n");
        sb.append("Parents:\n");
        for (Person p : parents) {
            sb.append(p.name);
            sb.append(" ");
            sb.append(p.date);
            sb.append("\n");
        }
        sb.append("Children:\n");
        for (Person p : children) {
            sb.append(p.name);
            sb.append(" ");
            sb.append(p.date);
            sb.append("\n");
        }
        return sb.toString();
    }
}