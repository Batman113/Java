import java.util.Arrays;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []arr = {10, 20, 30};
//		for(int it : arr) {
//			System.out.println(it);
//		}
		int arr[] = new int[5];
		Scanner obj = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; ++i) {
			arr[i] = obj.nextInt();
		}
		Arrays.sort(arr);
		for(int it : arr) {
			System.out.println(it);
		}
	}

}
