// Juliette Kang
// JK3466
// ArrayBuilder2.java - this class creates an array of rectangle and uses a recursive binary search to find a rectangle //

import java.util.Arrays;

	public class ArrayBuilder2 
	{
	        public static void main(String args[])
	        {
	                // create array //
	                Rectangle [] a;
	                a = new Rectangle[5];
			
			// fill array with 5 items //
	                a[0] = new Rectangle (5, 5);
	                a[1] = new Rectangle (10, 6);
	                a[2] = new Rectangle (4, 7);
	                a[3] = new Rectangle (6, 8);
	                a[4] = new Rectangle (11, 13);

	                // sort array by perimeter size //
	                Arrays.sort(a);      
			
			// call binarySearch method to find desired object //
		        int x =  binarySearch(a, a[3]);
	                if (x != 0)
			{
				System.out.println("Desired Rectangle found");
			}
	        }
	             
	
	public static <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] a, AnyType x)
	{
	    	return binarySearch(a, 0, a.length, x);
	}
	
	public static <AnyType extends Comparable<AnyType>>int binarySearch(AnyType[] a, int start, int end, AnyType x)
	{                
		int middle = (start + end) / 2;  // find the halfway point of the array //
	    	if (end < start)
	    	{
	    		return -1;   	
	    	}
	    	   			
	    	
		else if (x.compareTo(a[middle]) == 0) // if the target object is in the middle, return middle //
  	   	{
	    	   	return middle;
	    	}
	    	  
						       
	    	else if(x.compareTo(a[middle]) == -1) // if the target object is less than the midpoint element, look in the first half of the array //
		{
	                return binarySearch(a, start, middle -1, x);
	        } 
						
		
		else if (x.compareTo(a[middle]) == 1) // if the target object is greater than the midpoint elemnt, look in the second half of the array //
		{
	               	return binarySearch(a, middle +1, end, x);
	       	}
		
		return 0;
	}
	
}
