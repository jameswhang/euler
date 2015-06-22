import java.math.BigDecimal;

public class problem15 {
	public static void main(String[] args) {
		int N = 20;
		double[] arr = new double[N];
		for(int i = 0; i < N; i++) {
			arr[i] = 1; // initialize
		}
		for(int i = 0; i < N; i++) {
			arr[0] += 1;
			for(int j = 1; j < N; j++) {
				arr[j] += arr[j-1];
			}
		}
		BigDecimal sumPrint = new BigDecimal(arr[N-1]);
		System.out.println(sumPrint);
	}
}
