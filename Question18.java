//Write a program to demonstrate numeric overflow in Java.
public class Question18 {
    public static void main(String[] args) {
        // Overflow with int
        int maxInt = Integer.MAX_VALUE; 
        System.out.println("Maximum int value: " + maxInt);

        int overflowInt = maxInt + 1;   // causes overflow
        System.out.println("After overflow (maxInt + 1): " + overflowInt);

        // Overflow with byte
        byte maxByte = Byte.MAX_VALUE;  
        System.out.println("Maximum byte value: " + maxByte);

        byte overflowByte = (byte)(maxByte + 1); // causes overflow
        System.out.println("After overflow (maxByte + 1): " + overflowByte);
    }
}
