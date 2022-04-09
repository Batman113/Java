import java.util.Scanner;

public class whileclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		while(num > 0) {
			if(num % 2 == 0) {
				System.out.println("Even number " + num);
			}
			else {
				System.out.println("Odd number " + num);
			}
			num--;
		}

	}

}
