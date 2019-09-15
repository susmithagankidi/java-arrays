//Pivot Index
import java.util.*;
public class PivotIndex {

	public static int Piv(int a[])
	{
	//int RightSum=0;
	int LeftSum=0;
	int TotalSum=0;
	for(int i=0;i<a.length;i++) {
		TotalSum=TotalSum+a[i];
	}
	//LeftSum=RightSum
	for(int i=0;i<a.length;i++)
	{
		if(i!=0)
		  LeftSum=LeftSum+a[i-1];
		if(TotalSum-LeftSum-a[i]==LeftSum)
		{
			return i;	
			}
	}
	return -1;
		
	}
	public static void main(String[] args)
	{
		int a[]= {1,7,3,6,5,6};
        int value=Piv(a);
        System.out.println("The value of index is "+value);	

}
}
