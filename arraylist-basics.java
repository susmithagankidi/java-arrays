import java.util.*;
import java.util.ArrayList;

public class testarraylist {

	public static void main(String[] args)
	{
		//Initialize
		ArrayList<String> v = new ArrayList<String>();
		System.out.println("The size of ArrayList is " +v.size());
		v.add("one");
		v.add("two");
		v.add("Three");
		v.add("4");
		System.out.println("The size of arraylist after adding elements " +v.size());
		v.remove("one");
		System.out.println("The size after removing an element " +v.size());
	}

}
