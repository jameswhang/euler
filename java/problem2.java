public class problem2
{
    public static int findFib(int n1, int n2)
    {
        return n1 + n2;
    }
    public static void main(String[] args)
    {
        int one = 1;
        int two = 2;
        int fib = findFib(one, two);
        int sum = two;
        while(fib < 4000000)
        {
            if ((fib % 2) == 0) sum += fib;
            one = two;
            two = fib;
            fib = findFib(one, two);
        }
        System.out.println("Result: " + sum);
    }
}
