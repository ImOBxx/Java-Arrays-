import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Array Values: ");
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
			if (arr[i] % 2 == 0)
			{
			sum = sum + arr[i];
			System.out.println(arr[i]);
			System.out.println("Sum: " + sum);
			}
		}
		System.out.println("Sum: " + sum);
		

	}

}
