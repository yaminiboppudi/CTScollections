import java.util.*;
public class ListIterator1
{

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ListIterator<Integer> iterator=a.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}

}
}
