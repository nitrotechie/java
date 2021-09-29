// Write a java program to take an array of strings as an input, and arrange strings in Ascending order.

import java.util.Arrays;
import java.util.Scanner;
public class StringSort {
    public static void main(String[] args) {
        String name[];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Six Strings: ");
        name = new String[6];
        for (int i = 0; i < 6; i++) {
            name[i] = obj.nextLine();
        }
        Arrays.sort(name);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(name));
        
    }
}
