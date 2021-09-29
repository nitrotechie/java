import java.util.Scanner;

// Write a program to count the number of words that start with a capital letter.
public class practical_1 {
    public static void main(String[] args) {
        String str1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String: ");
        str1 = obj.nextLine();
        int len = str1.length();
        char c;
        int count = 0;
        for (int i = 0; i < len; i++) {
            c = str1.charAt(i);
            if (c>=65 && c<=90) {
                count++;
            } 
            
        }
        System.out.println(str1);
        System.out.println("No. of capital letter in given string is " + count);

    }
}
