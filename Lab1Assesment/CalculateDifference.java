import java.util.Scanner;

public class CalculateDifference {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		System.out.println("The difference is"+calculateDifference(n));
		// TODO Auto-generated method stub

	}
	
	public static int calculateDifference(int n) {
		int sum=0;
		int sumOfN=0,sumOfsquares=0;
    	sumOfN=(n*(n+1)/2);
    	sumOfsquares=((n*(n+1)*(2*n+1))/6);
    	sum=(sumOfN*sumOfN)-sumOfsquares;
    	return sum;
    }
}
		
