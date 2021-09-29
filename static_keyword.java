import java.util.Scanner;

public class static_keyword {
    public static void main(String[] args) {
        
    }
    class Cars {
        String car_name;
        String car_brand;
        static int car_no = 1000;
        public void Main(String n, String b) {
            this.car_name = n;
            this.car_brand = b;
            this.car_no = carNumber();
        }
        static int carNumber() {
            car_no++;
            return car_no;
        }
    }


}
