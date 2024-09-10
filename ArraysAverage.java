import java.util.Scanner;

public class ArraysAverage {

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
		int avg = 0;
		for (int i = 0; i < n; i++)
		{
			sum = sum + arr[i];
			avg = sum / n;
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average Of Elements In the Array: " + avg);
		

	}

}
