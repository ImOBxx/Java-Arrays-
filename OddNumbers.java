import java.util.Scanner;

public class OddNumbers {

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
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] % 2 != 0)
			{
				System.out.println(arr[i]);
				sum = sum + arr[i];
			
			}
			
		}
		System.out.println("Sum: " + sum);
		

	}

}
