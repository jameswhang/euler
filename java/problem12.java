
public class problem12 {
	public static int numDivisors(int num) {
		int total = 0;
		int i;
		for(i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				total++;
			}
		}
		i--;
		if (num == i*i) {
			total *= 2;
			total -= 1;
		} else {
			total *= 2;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int tri = 0;
		for(int i = 1; ; i++) {
			tri += i;
			if (numDivisors(tri) > 500) {
				System.out.println(tri);
				break;
			}
		}
	}
}
