import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor extends Human {

    public Doctor () { super(); }
    public Doctor(String name, int age) {
        super(name, age);
    }

   @Override
   public String toString() {
        return Arrays.asList("DOCTOR \n"
                + "Override toString for " + this.getClass().toString()
                + "\n" + "Name is " + name, " Age is " + age, " Force is " + force) + "\n";
   }

    public void treat () { System.out.println("Say AAAAAAA \n"); }
}
