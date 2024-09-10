import java.util.Scanner;

public class MinimumArrayValue {

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
				int min = arr[0];
				for (int i = 0; i < n; i++)
				{
					if (arr[i] < min)
					{
						min = arr[i];
					}
				}
				System.out.println("Minimum Value In The Array: " + min);
				
				
				
				

	}

}
