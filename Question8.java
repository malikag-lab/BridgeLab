//Write a program to demonstrate implicit and explicit type casting.
public class Question8 {
    public static void main(String[] args) {
        int intVariable=10;
        double doubleVariable=intVariable;

        System.out.println("Implicit Type Casting:");
        System.out.println("int Variable value: "+intVariable);
        System.out.println("double Variable Value: "+doubleVariable);
        System.out.println();

        doubleVariable=999.9;
        intVariable=(int) doubleVariable;

        System.out.println("Explicit Type Casting:");
        System.out.println("double Variable value: "+doubleVariable);
        System.out.println("int Variable Value: "+intVariable);
    }
}
