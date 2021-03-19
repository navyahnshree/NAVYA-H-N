import java.util.Scanner;

public class PoerOfTwo {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		System.out.println(checkNumber(n));// TODO Auto-generated method stub

	}
	public static boolean checkNumber(int n) {
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
		return false;
			n=n/2;
		
	}
		return true;
			}
}

