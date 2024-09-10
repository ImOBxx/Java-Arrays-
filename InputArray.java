import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 1; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		}
		System.out.print("{");
		for (int i = 1; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			         
		

	}

}
