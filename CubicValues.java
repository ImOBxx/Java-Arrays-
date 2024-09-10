import java.util.Scanner;

public class CubicValues {

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
		int f = 1;
		System.out.print("{");
		for (int i = 0; i < n; i++)
		{
			f = (arr[i] * arr[i] * arr[i]);
			System.out.print(f + " "); 
		}
		System.out.print("}");
		

	}

}
