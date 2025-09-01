// Write a program to find the sum of two integers using variables.
import java.util.*;
class GetSum{
    int FirstInput, SecondInput;

    int sum (int a, int b){
        int TotalSum=a+b;
        return TotalSum;
    }
}
public class Question2{
    public static void main(String [] args){
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter First Number: ");
     int a = scn.nextInt();
     
     System.out.println("Enter the Second Number: ");
     int b=scn.nextInt();
     GetSum obj= new GetSum();
     int TotalSum=obj.sum(a,b);
     System.out.println("The total sum is:"+TotalSum);
    }
}