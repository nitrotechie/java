import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) { 
        System.out.println("Enter the number of element : ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(); // number of element
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));
        }
    }
    static int fibo(int n) {
        if (n<=1) {
            return n;
        }
        
        return fibo(n-1) + fibo(n-2);
    }
}
