import java.util.Scanner;

public class ArraysBubblesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int temp;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < (n - 1) - i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
