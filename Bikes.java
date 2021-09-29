class Bike {
    final void run(){
        System.out.println("Bike is Running.");
    }
}
public class Bikes extends Bike{
    public static void main(String[] args) {
        Bikes b = new Bikes();
        b.run();
    }
}
