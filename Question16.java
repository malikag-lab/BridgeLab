//Write a program to demonstrate the use of a static final variable (constant).
import java.util.*;

class ComputeArea {
    static final float PI = 3.14f;

    float AreaCircle(float radius) {
        return PI * radius * radius;
    }
}

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the radius of the circle: ");
        float num = input.nextFloat();

        ComputeArea obj=new ComputeArea();

        System.out.println("The Area of the circle is: " + obj.AreaCircle(num));
    }
}
