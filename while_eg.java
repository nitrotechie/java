import java.util.Scanner;
public class while_eg {
    public static void main(String[] args) {
        int number;
        int i = 1;
        Scanner obj = new Scanner(System.in);
        number = obj.nextInt();
        while (i<=number) {
            System.out.println("value of i: " + i + "\n");
            i++;            
        }
    }
}
