import java.util.Scanner;

public class Q1 {

	private static int multiple3And5Sum(int numberBelow) {
		int sum = 0;
		for (int i = 1; i < numberBelow; i++) {
			if (i % 3 == 0)
				sum += i;
			else if (i % 5 == 0)
				sum += i;
		}
		
		return sum;
		
	}
	
	private static int getInput() {
		int numToReturn;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number you want sum of multiples 3 and 5.");
		numToReturn = kb.nextInt();
		return numToReturn;
	}
	
	public static void main(String[] args) {
		System.out.println(multiple3And5Sum(getInput()));
	}
}
