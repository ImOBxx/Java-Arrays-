import java.util.Scanner;

public class PrintSumOddEvenArray {

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
		int sum1 = 0;
		for (int i = 0; i < n; i++)
		{
			if (i % arr[i] == 0)
			{
				System.out.println(arr[i]);
				sum = sum + arr[i];
				
				
			}
			else if(i % arr[i] != 0)
			{
				System.out.println(arr[i]);
				sum1 = sum1 + 0;
			}
		}
		System.out.println("Sum Of Even Numbers: " + sum);
		System.out.println("Sum Of Odd Numbers: " + sum1);
		


	}

}
