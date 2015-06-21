
public class problem7 {
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
		int count = 1;
		int num = 3;
		while (count < 10001) {
			if (isPrime(num)) {
				count++;
			}
			num += 2;
		}
		num -= 2;
		System.out.println(num);
	}
}
