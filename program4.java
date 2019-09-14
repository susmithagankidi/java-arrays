//Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not. 
import java.util.*;
public class Insert
{
	public static void main (String[] args)
	{
		System.out.println("The value to be entered is ");
		Scanner sc = new Scanner(System.in);
		int[] value = new int[10];
		for(int i=0;i<value.length;i++)
		{
			value[i]=sc.nextInt();
		}
		
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=value[i];
		}
		System.out.println("Eneter the value to check ");
		int check=sc.nextInt();
		boolean found =false;
         for(int i=0;i<a.length ;i++)
        	 {
        	 if(a[i]==check)
        	 {
        		   found= true;
        		   break;
              }
        	 }
         if(found)
         {
        	 System.out.println("The value is present");
         }
        	 else
        	 {
        		 System.out.println("the value is not present");
        	 }
              
		/*System.out.println("The value of 1st element is "+a[0]);
		System.out.println("The value of 2nd element is "+a[1]);
		System.out.println("The value of 1st element is "+a[2]);
		System.out.println("The value of 1st element is "+a[3]);
		System.out.println("The value of 1st element is "+a[4]);
		System.out.println("The value of 1st element is "+a[5]);
		System.out.println("The value of 1st element is "+a[6]);
		System.out.println("The value of 1st element is "+a[7]);
		System.out.println("The value of 1st element is "+a[8]);
		System.out.println("The value of 1st element is "+a[9]);
		*/
		
	}
}
