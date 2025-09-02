//Write a program to use var (Java 10+) for type inference.
import java.util.*;

public class Question17 {
 public static void main(String[] args) {
    var number=10; //inferred as int
    var sentence="This is a sentence"; //inferred as String
    var isTrue= true; // inferred as boolean
    var price=99.99; // inferred as double

    System.out.println("Number is : "+number);
    System.out.println("Sentence is : "+sentence);
    System.out.println("Boolean Value is : "+isTrue);
    System.out.println("Price Value is : "+price);
    
 }   
}
