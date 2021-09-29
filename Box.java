class Volume{
    void volume(int l, int b, int h){
        int v = l*b*h;
        System.out.println("Volume of a box is: " + v);
    }
    void volume(int l, double b, int h){
        double v = l*b*h;
        System.out.println("Volume of a box is: " + v);
    }
    void volume(double l, int b, double h){
        double v = l*b*h;
        System.out.println("Volume of a box is: " + v);
    }
}
public class Box {
    public static void main(String[] args) {
        Volume vol = new Volume();
        vol.volume(5, 6, 7);
        vol.volume(5, 6.5, 7);
        vol.volume(6.5, 5, 7.5);
    }
}