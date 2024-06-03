import java.nio.channels.DatagramChannel;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Enum;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Figures
        Figure figure = new Figure(EnumFigures.TRIANGLE,5.0f);
        Triangle triangle = new Triangle(EnumFigures.TRIANGLE, 10.0f);
        Square square = new Square(EnumFigures.SQUARE, 5.0f);
        Circle circle = new Circle(EnumFigures.CIRCLE, 5.0f);

        //checkCapacity
        triangle.checkCapacity(triangle);
        /*
        triangle.checkCapacity(circle);
        triangle.checkCapacity(square);

        circle.checkCapacity(triangle);
        circle.checkCapacity(circle);
        circle.checkCapacity(square);

        square.checkCapacity(triangle);
        square.checkCapacity(circle);
        square.checkCapacity(square);
         */

        // don't write lower
        // Humans
        Builder builder = new Builder("John", 37);
        builder.build(10);

        Human doctor = new Doctor("John", 37);

        Grandma grandma = new Grandma();
        grandma.treat();
        grandma.cook();

        Musician musician = new Musician("Ilya", 27);

        //System.out.println("builder " + builder.compareTo(musician) + "musician\n");

        ArrayList<Human> arrayOfHumanHeirs = new ArrayList<>();
        arrayOfHumanHeirs.add(builder);
        arrayOfHumanHeirs.add(musician);
        arrayOfHumanHeirs.add(grandma);
        arrayOfHumanHeirs.add(doctor);


        Human human = new Human("Ivan", 23);
        human.compareTo(builder);

        // hashcode
        if (human.hashcode() == figure.hashcode())
            System.out.println("Human = Figures");
        else System.out.println("Human != Figures");

        //equals
        if (triangle.equals(builder))
            System.out.println("triangle is equals builder");
        else System.out.println("triangle is not equals builder");

        if (triangle.equals(triangle))
            System.out.println("triangle is equals triangle \n");
        else System.out.println("triangle is not equals triangle \n");

       Human IlyaPerfect = new Human ("Ilya", 27);
       IlyaPerfect.nick = "Ilya Perfect";

       Human IlyaDick = new Human ("Ilya", 33);
       IlyaDick.nick = "Jesus Huev";
       IlyaDick.humanity = false;

       System.out.println("Humanity of " + IlyaPerfect.nick + " is " + IlyaPerfect.humanity);
       System.out.println("Humanity of " + IlyaDick.nick + " is " + IlyaDick.humanity);
       System.out.println(IlyaPerfect.nick + " is equals " + IlyaDick.nick + IlyaPerfect.equals(IlyaDick));
       System.out.println(IlyaDick.nick + " is equals " + IlyaPerfect.nick + IlyaDick.equals(IlyaPerfect));
    }
        // must read chapter about arrays
        // must find about override toString(), hashCode(), equals(), compareTo()
        // check using of polymorphism
        // must learn exceptions
        // must learn collections, after that need to learn enums
}
