public class finalize {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Rahul");
        emp.display();
    }
}
class Employee{
    private int ID;
    private String name;
    private int age;
    private static int num = 1;
    public Employee(int x, String y, int z) {
        this.ID = num++;
        this.name = y;
        this.age = x;
    }
    public void display() {
        System.out.println("The ID of the employee is: " + ID + "\nName of the employee is : " + name);
    }
}
