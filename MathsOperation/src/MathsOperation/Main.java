package MathsOperation;
import MathsOperation.MathsOperation1;
import MathsOperation.MathsOperation2;
public class Main {
    public static void main(String[] args) {
		MathsOperation1 add_sub = new MathsOperation1();
		MathsOperation2 mul_div = new MathsOperation2();
		add_sub.add(5, 1);
		add_sub.sub(5, 1);
		mul_div.mul(10, 5);
		mul_div.div(10, 5);
	}
}
