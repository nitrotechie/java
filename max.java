public class max {
    public static void main(String[] args) {
        int num, maximum;
        num = Integer.parseInt(args[0]);
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(args[i+1]);
        }
        maximum = arr[0];
        for (int i = 0; i < num; i++) {
            if (maximum<arr[i]) {
                maximum = arr[i];
            }
        }
        System.out.println("Maximum value from given array is: " + maximum );
    }
}
