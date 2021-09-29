import java.util.*;
public class switch_eg {
    public static void main(String[] args) {
        int number;
        Scanner obj = new Scanner(System.in);
        number = obj.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        
            default:
                System.out.println("Enter Between 1 to 3");
                break;
        }
    }
}
