//Write a program to swap two numbers without using a third variable.
import java.util.*;
public class Question4 {
    public static void main(String [] args){
    int FirstNumber=10;
    int SecondNumber=20;
    
    
    System.out.println("The Numbers before Swapping are:");
    System.out.println("The First Number before swapping is:"+FirstNumber);
    System.out.println("The Second Number before swapping is:"+SecondNumber);

    FirstNumber=FirstNumber+SecondNumber;
    SecondNumber=FirstNumber-SecondNumber;
    FirstNumber=FirstNumber-SecondNumber;
 
    System.out.println("The Numbers after Swapping are:");
    System.out.println("The First Number after swapping is:"+FirstNumber);
    System.out.println("The Second Number after Swapping is:"+SecondNumber);
    }
}
