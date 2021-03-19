import java.util.Scanner;
public class PositiveString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.next();
		System.out.println(checkIfPositive(str));

	}
	private static String checkIfPositive(String pStr)
	{
		int count=0;
		String output="";
		for(int i=0;i<pStr.length()-1;i++)
		{
			if(pStr.charAt(i)<pStr.charAt(i+1))
				count++;
			else
				break;
		}
		if(count==pStr.length()-1)
			output+="psitive string";
		else
			output+="not positive string";
		return output;
	}

}
