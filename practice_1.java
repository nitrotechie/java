import java.util.Scanner;

// Write a program to count the number of words that start with a capital letter as well as small letters.
public class practice_1 {
    public static void main(String[] args) {
        String str1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String: ");
        str1 = obj.nextLine();
        int len = str1.length();
        char c;
        int countCaptital = 0;
        int countSmall = 0;  
        for (int i = 0; i < len; i++) {
            c = str1.charAt(i);
            if (c>=65 && c<=90) {
                countCaptital++;
            } else if (c>=97 && c<=122) {
                countSmall++;
            }
            
        }
        System.out.println("No. of captital letter in given string is " + countCaptital);
        System.out.println("No. of small letter in given string is " + countSmall);

    }
}

