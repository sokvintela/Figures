import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Builder extends Human {
    public Builder () {
        super();
    }

    public Builder(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.join ("\n",
                "BUILDER",
                "Override toString for " + this.getClass().toString())
                +"\n"
                +Arrays.asList("Name is " + name, " Age is " + age, " Force is " + force)
                +"\n";
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        Human object = (Human) obj;
        System.out.println("Compare with humanity ");
        return name == object.name && humanity == object.humanity;
    }

    public void build (int buildValue) {
        System.out.println("knock knock knock \n" + "Builder force is " + (force-= buildValue) + "\n");
    }
}
