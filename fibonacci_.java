class fibonacci_{
	public static void main(String[] n) {
		int num;
		num = Integer.parseInt(n[0]);
		for (int i = 0; i < num; i++) {
            System.out.println(fibo(i));
        }
	}
	static int fibo(int n) {
        if (n<=1) {
            return n;
        }
        
        return fibo(n-1) + fibo(n-2);
    }
}