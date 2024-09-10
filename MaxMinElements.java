import java.util.Scanner;

public class MaxMinElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		int max;
		int min;
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		max = arr[0];
		min = arr[0];
		for (int i = 0; i < n; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
			else if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Max Element: " + max);
		System.out.println("Min Element: " + min);
		

	}

}
