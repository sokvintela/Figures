import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;

public class Grandma extends Doctor {

    public Grandma () { super(); }

    public Grandma(String name, int age) {
        super(name, age);
    }

   @Override
   public String toString() {
        ArrayList a = new ArrayList();
        a.add("GRANDMA");
        a.add("\nOverride toString for " + this.getClass().toString());
        a.add("\nName is " + name);
        a.add("Age is " + age);
        a.add("Force is " + force);
        return a + "\n";
   }

    public void cook () { System.out.println("Hot cakes come on \n"); }
}
