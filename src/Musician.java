import java.util.*;

public class Musician extends Human {

    public Musician () { super(); }

    public Musician (String name, int age) {
        super(name, age);
    }

    public String toString () {
        ArrayList nameList = new ArrayList();
        nameList.add("My name is ");
        nameList.add(name);
        ArrayList <ArrayList> informationList = new ArrayList<>(nameList);

        ArrayList ageList = new ArrayList();
        ageList.add("My age is ");
        ageList.add(age);
        informationList.add(ageList);

        return informationList.toString() + "\n";
    }

    public void play () {
        System.out.println("Param pum pum ");
        return;
    }
}

