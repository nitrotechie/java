import java.util.Scanner;
public class practice_1_2 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter Your Sentance: ");
        Scanner obj = new Scanner(System.in);
        String sentance = obj.nextLine();
        for (int i = 0; i < sentance.length(); i++) {
            char character = sentance.charAt(i);
            if (character == 'a' ||character == 'e' ||character == 'i' ||character == 'o' ||character == 'u'|| character == 'A' ||character == 'E' ||character == 'I' ||character == 'O' ||character == 'U' ) {
                count++;
            } 
        }
        System.out.println("No. of Vowels in your sentance is : " + count);
    }
}
