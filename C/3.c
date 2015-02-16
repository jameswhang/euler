#include<stdio.h>
#include<math.h>

/*
 * isPrime - Function to check whether a number is a prime number
 *
 * @ret:
 * 1 if Prime. 0 if not Prime. 
 *
 * @param:
 * int num - Number to be checked
*/
int isPrime(double num)
{
	double i = 0.00;
	if (num < 2)
	{
		return 0;
	} else {
		while (i < (sqrt(num)))
		{
			if ((int)fmod(num, i) == 0)
			{
				return 0;
			}
			i = i + 1;
		}
		return 1;
	}
}

int main(void)
{
	double i = 0;
	double largetPrime = 0;
	double number = 600851475143;

	while (i < number) {
		//printf("Checking %lf...\n", i);
		if ((int)fmod(number, i) == 0)
		{
			if (isPrime(i))
				largetPrime = i;
		}
		i = i + 1;
	}

	printf("Largest prime factor of %lf is %lf\n", number, largetPrime);
	return 0;
}