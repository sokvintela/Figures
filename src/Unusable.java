import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unusable {
    //массив с одним элементом и массив с двумя элементами
    int massiv [] = { 1, 2, 3};
    int massiv2 [][] = {{1, 2}, {3, 4}, {5, 6}};
    int [] massiv3 = new int [5];

    public void loopForSingleDimensionalArray () {
        for (int i = 0; i < massiv.length; i++)
            System.out.println("massiv " + i + " " + massiv[i] + "\n");
    }

    //массив длиной в 5 с шагом +5 + принтлн
    public void loopForFiveStepsArray () {
        for (int i = 0; i < massiv3.length; i++ ) {
            massiv3[i] = i + 5;
            System.out.println("massiv" + i + "" + massiv3[i] + "\n");
        }
    }

    //бесконечный while
    public void infinityLoop () {
        while (true) {
            System.out.println("infinity loop \n");
            return;
        }
    }

    //if else
    public void ifelseConstruction () {
        if (massiv[0] == 0) {
            massiv[0] = 1;
        }
        else {
            massiv[0] = 1;
        }
    }

    // forech
    public void foreachConstruction () {
        int j = 0;
        for (int numbers : massiv) {
            j++;
            System.out.println("massiv[" + j + "] " + numbers + "\n");
        }
    }

    //foreach indexOf()
    public void foreachForCollections () {
        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("1");
        stringList1.add("2");
        stringList1.add("3");
        System.out.println("stringList1 " + stringList1);
        for (String s : stringList1) {
            System.out.println("stringList1[" + stringList1.indexOf(s) + "] " + s  + "\n");
        }

        ArrayList<String> stringList2 = new ArrayList<>(Arrays.asList("4", "5", "6"));
        System.out.println("stringList2 " + stringList2);
        for (String s : stringList2) {
            System.out.println("stringList2[" + stringList2.indexOf(s) + "] " + s + "\n");
        }

        List<String> stringList3 = Arrays.asList("7", "8", "9");
        System.out.println("stringList3 " + stringList3);
        for (String s : stringList3) {
            System.out.println("stringList3[" + stringList3.indexOf(s) + "] " + s + "\n");
        }

        String[] arrayOfStrings = new String[]{"10", "11", "12"};
        System.out.println(arrayOfStrings);
        System.out.println(arrayOfStrings.toString());
    }

    // do while
    // goto 5
    // enum values
    public void valueOfForEnums () {
        for (EnumFigures c : EnumFigures.values())
            System.out.println(c);

        System.out.println(EnumFigures.valueOf("TRIANGLE"));
        System.out.println(EnumFigures.valueOf(EnumFigures.class, "TRIANGLE"));
        System.out.println(Arrays.toString(EnumFigures.values()));
    }
}
