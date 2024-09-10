import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String s = "Hello";
		char[] arr = s.toCharArray();
		for (char i : arr) {
			//System.out.println(i);
			 * 
			 */
			
		String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
		Arrays.sort(cars);
		for (String x : cars) {
			System.out.println(x);
		}

	}
	}

