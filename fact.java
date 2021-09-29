// Aim: To find a factorial of a number using CMD line input.
public class fact {
    public static void main(String[] a) {
        int number;
        number = Integer.parseInt(a[0]);
        int n = 1;
        for (int i = 1; i <= number; i++) {
            n = n * i;
        }
        System.out.println("The factorial of " + number + " is " + n);
    }
}