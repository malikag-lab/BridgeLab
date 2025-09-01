import java.util.*;
//Write a program to swap two numbers using a third variable. 
public class Question3 {
    public static void main(String [] args){
    int FirstNumber=10;
    int SecondNumber=20;
    int temp;
    
    System.out.println("The Numbers before Swapping are:");
    System.out.println("The First Number before swapping is:"+FirstNumber);
    System.out.println("The Second Number before swapping is:"+SecondNumber);

    temp=FirstNumber;
    FirstNumber=SecondNumber;
    SecondNumber=temp;
 
    System.out.println("The Numbers after Swapping are:");
    System.out.println("The First Number after swapping is:"+FirstNumber);
    System.out.println("The Second Number after Swapping is:"+SecondNumber);
    }

}

