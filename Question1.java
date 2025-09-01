import java.util.*;
class VariableDataTypes {
    byte byteVariable = 100;
    short shortVariable = 32000;
    int intVariable = 10;
    long longVariable = 10000000000L; 
    float floatVariable = 0.9f;       
    double doubleVariable = 0.99999;
    char charVariable = 'A';
    boolean boolVariable = true;
}

public class Question1 {
    // Write a Java program to declare and print all primitive data types.
    public static void main(String[] args) {
        VariableDataTypes obj = new VariableDataTypes();
        
        System.out.println(
            "The byte Variable is : " + obj.byteVariable +
            "\nThe short Variable is : " + obj.shortVariable +
            "\nThe integer Variable is : " + obj.intVariable +
            "\nThe long Variable is : " + obj.longVariable +
            "\nThe float Variable is : " + obj.floatVariable +
            "\nThe double Variable is : " + obj.doubleVariable +
            "\nThe character Variable is : " + obj.charVariable +
            "\nThe boolean Variable is : " + obj.boolVariable
        );
    }
}
