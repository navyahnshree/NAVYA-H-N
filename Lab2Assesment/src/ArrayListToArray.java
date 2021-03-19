import java.util.ArrayList;
public class ArrayListToArray {
	public static void main(String[] args) {
	ArrayList<String> languages=new ArrayList<>();
	languages.add("Java");
	languages.add("Python");
	languages.add("Javascript");
	System.out.println("ArrayList:"+languages);
	
	String[] arr=new String[languages.size()];
	
	languages.toArray(arr);
	System.out.println("Array :");
	for(String item: arr  ) {
		System.out.println(item+" ");
	}

		// TODO Auto-generated method stub

	}

}
