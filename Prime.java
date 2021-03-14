import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		
						 
		Scanner sc= new Scanner(System.in);
		int i,j,p,n;
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		  // TODO Auto-generated method stub
			 for (i=2;i<n;i++) {
				 p=0;
					for( j=2;j<i;j++)
					{
						if(i%j==0)
						p=1;
					}
					if(p==0)
						System.out.println(i);
				}



	}

}
