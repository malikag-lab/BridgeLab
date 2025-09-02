//Write a program to demonstrate type promotion in arithmetic operations.
import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        byte b=10;
        char charVariable='A';

        int result1=b+charVariable;
        System.out.println("Result of byte + char (promoted to int): "+result1);
        System.out.println();

        long l1=1000L;
        float f=1.5f;
        System.out.println("Result of long + float (promoted to float): "+(l1+f));


    }
}
