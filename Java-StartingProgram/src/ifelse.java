import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if else
//		int pwd;
//		Scanner s = new Scanner(System.in);
//		pwd = s.nextInt();
//		System.out.print(pwd + "\n");
//		if(pwd == 10) {
//			System.out.print("Yes ! you did it\n");
//		}
//		else {
//			System.out.print("No, you have not");
//		}
		
		//for loop
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(int i = 0 ; i < n ; ++i) {
			System.out.println("hello person " + (i + 1));
		}
	}

}
