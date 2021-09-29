import java.util.*;
public class day2_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float num1 = num.nextFloat();
        float num2 = num.nextFloat();
        float add = num1 + num2;
        float sub = num1 - num2;
        float mul = num1 * num2;
        float div = num1 / num2;
        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Addition is: " + div);
    }
}
