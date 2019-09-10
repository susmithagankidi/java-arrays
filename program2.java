#Find whether the largest element in the array is at least twice as much as every other number in the array.If it is, return the index of the largest element, otherwise return -1.
import java.util.*;
public class problem1 {
	public static void main (String [] args)
{
		int []a = {2,3,0,1};
		System.out.println(findindex(a));
		
}
	public static int findindex(int []a)
	{
	int max=a[0];int index=0;
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
			index=i;
		}
	}
	System.out.println("The maximum element in the array is " +max);
    System.out.println("The value if index is " +index);
    
    for(int i=0;i<a.length;i++)
    {
    	if(index!=i && max>=2*a[i])
    	{
    		return index;
    	}
    	else
    	{
    	
	return -1;
}
}
	return index;
}
	}
