
import java.util.Scanner;
public class MirrorImageOfString {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string array:");
		String s=in.nextLine();
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println(s+"|"+reverse);
	}

}

