import java.util.*;
public class Indexof1 
{
public static void main(String args[])
{
	ArrayList<String> s= new ArrayList<>(Arrays.asList("kavya","manisha","sathya","shivani","sathya","sathya"));
	int m=s.indexOf("sathya");
	System.out.println(m);
	System.out.println(s.lastIndexOf("sathya"));
}
}
