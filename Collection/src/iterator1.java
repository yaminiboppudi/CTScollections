import java.util.*;
public class iterator1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Iterator<Integer> iterator=a.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
