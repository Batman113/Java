import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		int num, ch;
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		System.out.println("Enter the operation \n1. Add\n2. Subtraction \n3. Multiplication\n4.Division");
		ch = obj.nextInt();
		int a, b;
		a = obj.nextInt();
		b = obj.nextInt();
		switch(ch) {
			case 1 : System.out.println("Addition : " + (a + b));
			break;
			case 2 : System.out.println("Subtraction : " + (a - b));
			break;
			case 3 : System.out.println("Multiplication : " + ( a * b));
			break;
			case 4 : System.out.println("Division : " + (a / b));
			break;
			default : System.out.println("Nothing can be done here.....");
		}

	}

}
