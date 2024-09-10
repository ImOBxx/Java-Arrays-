import java.util.Scanner;

public class ReverseOrderDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		for (int i = n - 1; i >= 0; i--)
		{
			System.out.println(arr[i]);
		}
		

	}

}
