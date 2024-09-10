import java.util.Scanner;

public class SelectionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int small;
		int temp;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i <= n - 1; i++) 
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		for (int i = 0; i <= n - 2; i++)
		{
			small = i;
			for (int j = i + 1; j <= n - 1; j++)
			{
				if (arr[j] < arr[small])
				{
				   small = j;
				}
			}
		if (i != small)
		{
			temp = arr[i];
			arr[i] = arr[small];
			arr[small] = temp;
		}
		}
		for (int i = 0; i <= n - 1; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		

	}

}
