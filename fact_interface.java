import java.util.Scanner;

interface factorial1{
    void fact(int a);
}
class factorial2 implements factorial1{
    public void fact(int a) {
        int n = 1;
        for (int i = 1; i <= a; i++) {
            n = n * i;
        }
        System.out.println("The factorial of " + a + " is " + n);
    }
}
public class fact_interface {
    public static void main(String[] args) {
        factorial2 f = new factorial2();
        f.fact(5);
    }
}
