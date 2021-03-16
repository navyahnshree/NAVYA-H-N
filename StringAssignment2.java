
public class StringAssignment2 {

	public static void main(String[] args) {
		String url1="https://www.cognizant.com/admin/policy/index.html";
		String url2="https://www.cognizant.com/service.jsp";
		String url3="https://www.cognizant.com/customer/products/local/showProducts.asp";
		
		String command1= getCommand(url1);
		String command2= getCommand(url2);
		String command3= getCommand(url3);
		
		System.out.println("Command1: "+command1);
		System.out.println("Command2: "+command2);
		System.out.println("Command3: "+command3);
		
		// TODO Auto-generated method stub

	} 
		private static String getCommand(String url) {
			
			String c="";
			int index1=url.lastIndexOf('/');
			int index2=url.lastIndexOf('.');
			for(int i=index1+1;i<index2;i++ ) {
				c+=url.charAt(i);
			}
			return c;
		}
		

}
