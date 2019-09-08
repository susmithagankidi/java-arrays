import java.util.Arrays;

public class ArrayClass {
 public static void main (String [] args) {
	 //Initialize the array
	 int[]a=new int[5];
	 int[]b=new int[6];
	 int[]c= {1,2,3,4,5};
	 //Print the length of the arrays
	 System.out.println("The length of array a is " +a.length);
	 System.out.println("The length of array b is " +b.length);
	 System.out.println("The length of c is "+c.length);
	 //Accessing the elements
	 System.out.println("The first element is "+c[0]);
	 //Iterating the array and printing them
	 for(int i=0;i<c.length;i++)
	 {
		 System.out.println("The values of array are "+c[i]);
	 }
   //Iterating the array in second method (for each loop)
      for(int item: c) {
    	  System.out.println("The values are " +item);
      }
}
}
