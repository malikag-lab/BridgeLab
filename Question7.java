//Write a program to print default values of instance variables in a class.
import java.util.*;
class PrintDefault{
    int intVariable;
    byte byteVariable;
    short shortVariable;
    long longVariable;
    float floatVariable;
    double doubleVariable;
    char charVariable;
    boolean boolVariable;

    void Display(){
        System.out.println("Default value of int variable:"+intVariable);
        System.out.println("Default value of byte variable:"+byteVariable);
        System.out.println("Default value of short variable:"+shortVariable);
        System.out.println("Default value of long variable:"+longVariable);
        System.out.println("Default value of float variable:"+floatVariable);
        System.out.println("Default value of double variable:"+doubleVariable);
        System.out.println("Default value of char variable:"+charVariable);
        System.out.println("Default value of boolean variable:"+boolVariable);
    }    
}

public class Question7 {
    public static void main(String[] args) {
        PrintDefault obj=new PrintDefault();
        obj.Display();
    }
}
