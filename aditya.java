import java.util.Scanner;

public class aditya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Enrollment: :");
        int eno=sc.nextInt();
        System.out.println("Enter Name::");
        String name=sc.next();
        Main s1=new Main (eno, name);
        s1.getData();
        s1.display();
    }
}
class Main {
    int enroll_no; String name;
    static String clg_name="PIET";
    final int clg_code=49;
    static String dept;
    static int division;
    Main(int enroll_no, String name) {
        this.enroll_no = enroll_no;
        this.name = name;
        clg_name = "PIET";
    }
    static void getData() {
        dept="CSE";
        division=3;
    }
    void display() {
        System.out.println("Student Enrollment:: "+enroll_no);
        System.out.println("Student Name:: "+name);
        System.out.println("College Name:: "+clg_name);
        System.out.println("College Code:: "+clg_code);
        System.out.println("College Department: : "+dept);
        System.out.println("College Division:: "+division);
    }
}
