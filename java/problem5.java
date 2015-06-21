import java.util.HashMap;
import java.util.Map;

public class problem5 {
	public static boolean isPrime(int num) {
		double upper = Math.sqrt(num);
		boolean prime = true;
		for(int i = 2; i < upper; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {
		int orig = 2520;
		for (int i = 11; i <= 20; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				orig *= i;
			}
		}
		System.out.println(orig*2);
	}
}
