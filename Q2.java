/** 
 * Starting with 1 and 2, calculate sum of Fibonacci sequence values under 4 million
 * Due to size worry about blowing stack with a recursive answer
 */


public class Q2 {

	private static int sum(int underDigit) {
		int sum = 0, trail = 1, lead = 2; //Starting digits
		
		while (lead < underDigit) {
			if (lead % 2 == 0)
				sum += lead;
			int interim = lead;
			lead += trail;
			trail = interim;
//			System.out.println(lead);
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println(sum(4000000));
	}
}
