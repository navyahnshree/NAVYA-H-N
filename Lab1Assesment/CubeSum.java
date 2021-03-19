import java.util.Scanner;

public class CubeSum {
	
	public static int cubeSum() {
		Scanner sc= new Scanner(System.in);
		int cubeNum= 0,m,r; 
		System.out.println("Enter value of num:");
		int num=sc.nextInt();
       
		while(num!=0) {
			m=num/10;
			r=num%10;
			cubeNum=m*m*m+r*r*r;
			return cubeNum;
		}
        	
        
		return cubeNum;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cubeSum()); 
	}
	
	
}
