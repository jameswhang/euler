// TODO: Probably can do better than this...
public class problem9 {
	public static void main(String[] args) {
		int a, b, c;
		for(a = 1; a < 998; a++) {
			for (b = 1; b < 998; b++) {
				if (a + b > 999) {
					break;
				}
				c = 1000 - a - b;
				if (c * c == (a*a) + (b*b)) {
					System.out.println(a*b*c);
				}
			}
		}
	}
}
