public class swap {
    public static void main(String[] n) {
        int n1, n2, temp;
        n1 = Integer.parseInt(n[0]);
        n2 = Integer.parseInt(n[1]);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1 +" "+ n2);
    }
}
