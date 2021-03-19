import java.util.Scanner;
public class Consonants {
	
	static boolean isVowel(char ch)
	{
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
		{
			return false;
		}
		return true;
	}
	
	static String alterString(char[] s)
	{
		for (int i=0; i<s.length; i++)
		{
			if(!isVowel(s[i]))
			{
				if(s[i]=='z')
				{
					s[i]='b';
				}
				else
				{
					s[i]=(char)(s[i]+1);
				}
					
			}
		}
	
	return String.valueOf(s);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string array");
		String s=in.nextLine();
		System.out.println(alterString(s.toCharArray())); 
	}

}
