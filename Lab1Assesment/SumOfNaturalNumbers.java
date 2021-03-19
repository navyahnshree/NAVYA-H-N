import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number n");
		int n=in.nextInt();
		System.out.println("The sum of natural numbers upto:"+n+":"+calculateSum(n));

	}
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if((i%3==0)|(i%5==0))
			{
			sum+=i;
		    }
		}
		return sum;
	}
 }
