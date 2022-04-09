import java.util.Scanner;
public class inputAndOutput {
	public static void main(String[] args) {
		int a, b;
		float c, d;
		System.out.print("Enter the value of a and b");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextFloat();
		d = s.nextFloat();
		System.out.print(a + b);
		System.out.print(c + d);
	}
}
