import java.util.Scanner;

public class StoreElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Values: ");
			arr[i] = in.nextInt();
		
		}
		for (int i = 0; i < n; i++)
		{
			x = x + 1;
			System.out.println("Element a" + "[" + x + "]" + "=" + arr[i]);
		}
		
		

	}

}
