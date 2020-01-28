import java.util.ArrayList;

public class Clear1 
{
	public static void main(String args[])
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
		list1.remove("Kavya");
		list1.clear();
		System.out.println(list1);
}
}
