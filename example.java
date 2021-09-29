import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int number = sc.nextInt();
        student data[] = new student[number];
        for (int i = 0; i < number; i++) {
            data[i] = new student();
            data[i].dataInsert();
        }
        for (int i = 0; i < number; i++) {
            data[i].display();
        }

    }
}

class student {
    int rollno;
    String name;

    public void dataInsert() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        rollno = sc1.nextInt();
        System.out.println("Enter Name: ");
        name = sc1.next();
    }

    public void display() {
        System.out.println("Roll no is : " + rollno + "\tName is : " + name);
    }
}
