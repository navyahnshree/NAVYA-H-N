import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter integers with one space gap:");
		String s=in.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			n=Integer.parseInt(temp);
			System.out.println(n);
			sum=sum+n;;
		}
        System.out.println("sum of the integers is: " + sum);
        in.close();// TODO Auto-generated method stub

	}

}
