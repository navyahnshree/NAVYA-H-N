import java.util.*; 
public class DifferenceBetweenDigits {
	
	public static void main(String[] args) 
	{ 
		int num=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		System.out.println("Modified number:");
		System.out.println(modifyNum(n));
		
	} 
	public static String modifyNum(int n)
	{
		String str=" ";
		String s=Integer.toString(n);
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)>s.charAt(i+1))
			
				str=str+(s.charAt(i)-s.charAt(i+1));
				else
				str=str+(s.charAt(i+1)-s.charAt(i));
				
			}
		if(s.charAt(0)>s.charAt(s.length()-1))
		{
			str=str+(s.charAt(0)>s.charAt(s.length()-1));
		}
		else {
			str=str+(s.charAt(s.length()-1)>s.charAt(0));
			
		}
		return str;
	}
	} 