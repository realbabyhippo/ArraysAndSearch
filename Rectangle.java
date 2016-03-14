//Juliette Kang
// JK3466
// Rectangle.java - a class that constructs a Rectangle object and implements Comparable

public class Rectangle implements Comparable<Rectangle>
{
	
	//instance variables
		private int length;
		private int width;

	// construct Rectangle
	public Rectangle (int width, int length) 
	{
	this.width = width;
	this.length = length;
}


 
	// methods so subclasses can access the super's private variables 
	
	public int getLength ()
	{
		return length;
	}

	public int getWidth ()
	{
		return width;
	}


	public int  getPerimeter()
	{
       		int perimeter = 2 * (width + length);
		return perimeter;
    	}        	

	// Implement the compareTo() method
	public int compareTo(Rectangle other) 
	{
        if(getPerimeter() < other.getPerimeter())
            return -1;
        
	if(this.getPerimeter() > other.getPerimeter())
            return 1;
        
	return 0;
	}
}

