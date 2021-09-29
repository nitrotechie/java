class Shape {
    float area(float a) {
        float result = a*a;
        return result;
    }
    double area(double r) {
        double result = 3.14*(r*r);
        return result;
    }
    float area(float h, float b) {
        float result = (h*b)/2;
        return result;
    }
    double area(double w, double l) {
        double result = w*l;
        return result;
    }

}

public class area_poly {
    public static void main(String[] args) {
        Shape s = new Shape();
        float square, triangle;
        double circle, rectangle;
        square = s.area(2);
        circle = s.area(4);
        triangle = s.area(5, 6);
        rectangle = s.area(3, 4);
        System.out.println("Area of given Square is " + square);
        System.out.println("Area of given circle is " + circle);
        System.out.println("Area of given triangle is " + triangle);
        System.out.println("Area of given rectangle is " + rectangle);
    }
}
