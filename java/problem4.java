
public class problem4 {
	public static boolean isPalindrome(int someNum) {
		String numStr = Integer.toString(someNum);
		int i = 0;
		int len = numStr.length();
		boolean isPalindrome = true;
		while (i < (len / 2)) {
			if (numStr.charAt(i) != numStr.charAt(len-i-1)) {
				isPalindrome = false;
			}
			i++;
		}
		return isPalindrome;
	}
	public static boolean isPalindromeTest() {
		boolean testSucceed = true;
		if (!isPalindrome(9009)) {
			testSucceed = false;
		}
		if (isPalindrome(1234)) {
			testSucceed = false;
		}
		if (isPalindrome(57357)) {
			testSucceed = false;
		}
		if (!isPalindrome(12321)) {
			testSucceed = false;
		}
		return testSucceed;
	}
	public static void main(String[] args) {
		int firstNum = 999;
		int secondNum = 999;
		int ans = -1;
		
		while (firstNum > 900) {
			secondNum = 999;
			while (secondNum > 900) {
				System.out.println(firstNum * secondNum);
				if (isPalindrome(firstNum * secondNum) && (firstNum * secondNum > ans)) {
					ans = firstNum * secondNum;
				}
				secondNum--;
			}
			firstNum--;
		}
		System.out.println("Ans: " + ans);
	}
}
