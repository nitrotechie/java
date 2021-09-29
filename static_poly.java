class Addition{
    void Add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    void Add(int a, int b, int c){
        int d = a+b+c;
        System.out.println(d);
    }
}
public class static_poly {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.Add(5, 6);
        add.Add(5, 6, 7);
    }
}
