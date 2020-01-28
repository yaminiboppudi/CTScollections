import java.util.*;
public class Removeall1 
{
public static void main(String args[])
{
	ArrayList<String> list1 = new ArrayList<>();
	list1.add("Kavya");
	list1.add("Manisha");
	list1.add("Sathya");
	list1.add("Shivani");
	System.out.println(list1);
	list1.removeAll(Collections.singleton("Sathya"));
	System.out.println(list1);
}
}
