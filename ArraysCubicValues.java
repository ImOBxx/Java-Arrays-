import java.util.Scanner;

public class ArraysCubicValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum = (arr[i] * arr[i] * arr[i]);
			System.out.print("Element a" + "[" + arr[i] + "]" + "=" + sum + "\t");
		}

	}

}
