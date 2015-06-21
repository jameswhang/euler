/*
 * problem 6
 * expand the difference. we have:
 * (1 + 2 + 3 .. + N)^2 - (1^2+2^2+..+N^2)
 * manipulate the fact that difference takes the form of:
 * (1*2) + (1*3) ... + (1*N) +
 * (2*3) + (2*4) ... + (2*N) + 
 * ...
 * (N-1)*N
 */
public class problem6 {
	public static void main(String[] args) {
		int i = 1;
		int N = 100;
		int sum = 0;
		while(i < N) {
			for (int j = i + 1; j <= N; j++) {
				sum += i*j;
			}
			i++;
		}
		sum *= 2;
		System.out.println(sum);
	}
}
