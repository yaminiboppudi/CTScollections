import java.util.*;
public class Collection1 {

	public static void main(String[] args) 
	{
		
     ArrayList<String> list1 = new ArrayList<>();
     
	list1.add("Kavya");
	list1.add("Manisha");
	list1.add("Sathya");
	list1.add("Shivani");
	ArrayList<String> list2 = new ArrayList<>();
	list2.add("Hasitha");
	list2.add("Shreya");
	list2.add("Samyo");
	list1.addAll(list2);
	System.out.println(list1);

}
}
