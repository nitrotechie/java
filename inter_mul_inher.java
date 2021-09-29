interface Print1{
    void print();
}
interface Print2{
    void print();
}
class Show implements Print1,Print2{
    public void print() {
        System.out.println("Multiple Inheritance");
    }
}
public class inter_mul_inher {
    public static void main(String[] args) {
        Show s = new Show();
        s.print();
    }
}
