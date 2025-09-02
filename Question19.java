//Write a program to check if a long value can be stored in a float variable and display the result.

import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter a long value: ");
        long num = n.nextLong();

        
        float f = (float) num;

        
        long backToLong = (long) f;

        System.out.println("Original long value: " + num);
        System.out.println("Value stored in float: " + f);
        System.out.println("Converted back to long: " + backToLong);

}
}


