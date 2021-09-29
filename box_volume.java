public class box_volume {
    public static void main(String[] args) {
        box b = new box();
        box b1 = new box(10);
        box b2 = new box(10,4,6);
        b.volume();
        b1.volume();
        b2.volume();
    }
}
class box{
    double l, b, h, a;
    box() {
        System.out.println("Zero Args");
    }
    box(double l){
        this.l = l;
    }
    box(double b, double h, double a){
        this.a = a; 
        this.b = b;
        this.h = h;
    }
    void volume() {
        double v = a*b*h;
        System.out.println("Volume of a box is: " + v);
    }
}

