#Copy elements of array-1 to array-2
public class Find{
 public static void main (String [] args) {
	 int a[]= {1,2,3,4};
	 int b[]= new int[4];
	 for(int i=0;i<a.length;i++)
	 {
		 b[i]=a[i];
	 }
	for (int i=0;i<b.length;i++)
	{
		System.out.println("The values of array are " +b[i]);
	}
}
}
