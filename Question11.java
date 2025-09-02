//Write a program to show the difference between char and String data types.
import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        char charVariable='A';
        String stringVariable="Hello! This is a string";

        System.out.println("char example: "+charVariable);
        System.out.println("String example: "+stringVariable);
        System.out.println();

        // Difference in operations
        char char1='A';
        char char2='B';

        String string1="A";
        String string2="B";

        System.out.println("The sum of 'A' and 'B' as chars: "+(char1+char2));
        System.out.println("The concetenation of \"A\" and \"B\" as Strings: "+(string1+string2));

    }
}
