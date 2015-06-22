import java.math.BigDecimal;

public class problem10 {
	public static boolean isPrime(int num) {
		double upper = Math.sqrt(num);
		boolean prime = true;
		for(int i = 2; i <= upper; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		int number = 3;
		double sum = 2;
		
		while(number < 2000000) {
			if (isPrime(number)) {
				sum += number;
			}
			number += 2;
		}
		BigDecimal sumPrint = new BigDecimal(sum);
		System.out.println(sumPrint);
		System.out.println(sum);
	}
}
