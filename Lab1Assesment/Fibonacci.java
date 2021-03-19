import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i,fib0=1,fib1=1,fib2,n;
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		for ( i = 1; i <= n; ++i)
        {
			
            fib2 = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib2;
        }System.out.println(fib1 );

        
		// TODO Auto-generated method stub

	}

}
