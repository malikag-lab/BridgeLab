//Write a program to find the area of a circle using a final variable for PI.
import java.util.*;

class ComputeArea{
    final float PI=3.14f;
    float radius;

    float AreaCircle(float radius){
        float area=PI*radius*radius;
        return area;
    }

}

public class Question10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter the radius of the circle: ");
        float num= input.nextFloat();

        ComputeArea obj= new ComputeArea();
        System.out.println("The Area of the circle is:"+obj.AreaCircle(num));
    }
}
