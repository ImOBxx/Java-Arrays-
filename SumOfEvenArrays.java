import java.util.Scanner;

public class SumOfEvenArrays {

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
		System.out.println("\n");
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			
			if (arr[i] % 2 == 0)
			{
				sum = sum + arr[i];
				System.out.print(arr[i] + "\t");
			}
			
		}
		System.out.println("\n");
		System.out.print("Sum of Even numbers: " + sum);
		

	}

}
