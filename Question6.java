//Write a program to check whether a number is positive, negative, or zero.
import java.util.*;
class CheckNumber{
    int num;
     void checkValue (int num){
      if (num==0){
        System.out.println("The number is 0");

      }
      else if(num>0){
        System.out.println("The number is a positive number");
      }
      else{
        System.out.println("The number is a negative number");
      }


    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = n.nextInt();
        
        CheckNumber obj= new CheckNumber();
        obj.checkValue(num);


    }
}
