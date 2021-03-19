import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		int n;
		boolean flag=false;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
	    n=in.nextInt();
		
		int currentDigit=n%10;
		n=n/10;
		while(n>0) {
			if(currentDigit<n%10) {
				flag=true;
				break;
			}
			currentDigit=n%10;
			n=n/10;
		}
		if(flag) {
			System.out.println("Digits are not in increasing order.");
		}else {
	
           System.out.println("Digits are in increasing order.");
       }
    }
}