#include<stdio.h>

int main()
{
	int sum = 0;
	int temp;
	int prevFib = 1; // Previous Fibonacci number
	int curFib = 2; // Current Fibonacci number

	while(curFib < 4000000) {
		if (curFib % 2 == 0) {
			sum += curFib;
		}
		temp = prevFib;
		prevFib = curFib;
		curFib += temp;
	}
	printf("Sum of Fib numbers: %d\n", sum);
	return 0;
}