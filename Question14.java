//Write a program to use wrapper class methods to convert numbers to binary and hexadecimal.
import java.util.*;
public class Question14 {
    public static void main(String[] args) {
        int num;
        Scanner n= new Scanner(System.in);
        System.out.println("Please enter a number");
        num=n.nextInt();

        String binary=Integer.toBinaryString(num);
        String hex=Integer.toHexString(num);

        System.out.println("Number in decimal is: "+num);
        System.out.println("Number in Binary is: "+binary);
        System.out.println("Number in Hexadecimal is: "+hex);
    }
}
