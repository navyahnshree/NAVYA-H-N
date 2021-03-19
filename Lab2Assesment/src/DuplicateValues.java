
public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int [] {1,2,3,2,4,5,3,6,7,8,6};// TODO Auto-generated method stub
		System.out.println("Duplicate elements in given array:");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}

	
