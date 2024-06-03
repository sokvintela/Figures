import java.util.Arrays;
import java.util.Collections;

public class Human implements Comparable{
    public String name;
    public int age;
    public int force = 100;
    public boolean humanity = true;
    public String nick;

    public Human() {
        System.out.println(this);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" + "Age = " + age + "\n" + "Force = " + force + "\n";
    }

    public int hashcode() {
        int result = 31 * System.identityHashCode(name);
        result = 31 * System.identityHashCode(age) + result;
        return result;
    }


    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (obj == null || !this.getClass().equals(obj)) return false;
        if (obj == null || this.getClass().isInstance(obj.getClass())) return false;

        //Human object = (Human) obj;
        Human object = Human.class.cast(obj);

        System.out.println("Compare with humanity : ");
        return name == object.name && humanity == object.humanity;
    }

    public void eat() { force = force + 20; }
    public void sleep() { force = force + 20; }

    @Override
    public int compareTo(Object o) {
        Human obj = (Human) o;
        if (this.force > obj.force)
            return 1;
        if (this.force < obj.force)
            return -1;

        //Arrays.sort();
        //Collections.sort();
        compareTo(obj.force);
        return this.compareTo(o);
        //return 0;
    }
}
