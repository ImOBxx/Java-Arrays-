import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int [10];
		int sum  = 0;
		for (int i = 0; i < 10; i++)
		{
			Scanner in = new Scanner (System.in); 
			System.out.printf("Element Of a[%d] : ", i);
			a[i] = in.nextInt();
			
	    } 
		for (int i : a)
			sum = sum + i;
		System.out.println("Sum Values Of Array: " + sum);
		
		}
}
