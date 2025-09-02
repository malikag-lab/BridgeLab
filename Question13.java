//Write a program to show the difference between static and instance variables.
import java.util.*;

class VariableTypes{
    static int staticCounter=0;
    int instanceCounter=0;

    VariableTypes(){
        staticCounter++;
        instanceCounter++;
    }

    void display(){
        System.out.println("Instance Count is: "+instanceCounter+" "+"Static Count is: "+staticCounter);
    }
}
public class Question13 {
    public static void main(String[] args) {
        VariableTypes obj=new VariableTypes();
        obj.display();
 
        VariableTypes obj1=new VariableTypes();
        obj1.display();

        VariableTypes obj2=new VariableTypes();
        obj2.display();
    }
    


}
