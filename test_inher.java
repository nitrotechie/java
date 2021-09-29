public class test_inher {
    public static void main(String[] args) {
        B b = new B();
        b.Sum(5,6);
        b.factorial(5);
    }
}
class A {
    public void Sum(int a, int b){
        int c = a+b;
        System.out.println("The Sum of two numbers is: " + c);
    }
    public void factorial(int number){
        int n = 1; 
        
        for (int i = 1; i <= number; i++) {
            n = n * i;
        }
        System.out.println("The factorial is: " + n);
    }
}
class B extends A{

}




