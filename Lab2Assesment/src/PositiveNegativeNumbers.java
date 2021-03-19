import java.util.Scanner;

public class PositiveNegativeNumbers {

	public static void main(String[] args) {
		int countp=0,countn=0,countz=0,counto=0,counte=0,i;
		int arr[]=new int[20];
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter 20 numbers :");
		for(i=0;i<20;i++) {
			arr[i]=in.nextInt();
			
		}
		for(i=0;i<20;i++) {
			if(arr[i]<0) {
				countn++;
			}
			else if(arr[i]==0) {
				countz++;
			}
			else {
				countp++;
			}
			}
		for(i=0;i<20;i++) {
			if(arr[i]%2==0) {
				counte++;
			}
			else {
				counto++;
			}
		}
		System.out.println( countp+"Positive Numbers");
		System.out.println("\n"+countn+"Negative Numbers" );
		System.out.println("\n"+countz+"Zeros");
		System.out.println("\n"+counte+"Even Numbers");
		System.out.println("\n"+counto+"Odd Numbers");
		}
		// TODO Auto-generated method stub

	}


