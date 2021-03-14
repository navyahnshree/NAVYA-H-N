import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Select the light : 1.Red, 2.Green, 3.Yellow ");
		int light=sc.nextInt();
		
		
		
		if(light==1) {
			
			System.out.println("stop");
		}else if(light==2) {
			
			System.out.println("go");
		}
		else {
			
			System.out.println("ready");
		}
		// TODO Auto-generated method stub

	}

}
