//Write a program to show memory allocation difference between primitive and reference variables.
import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        int val=10; //primitive variable
        int [] arr={10,20,30}; //Reference variable
        System.out.println("Primitive variable: "+val); //prints the value of the variable directly

        System.out.println("Reference variable: "+arr); //prints the reference (memory address)
        System.out.println("Value of reference variable is: "+arr[0]); //prints the actual value
    }
}
