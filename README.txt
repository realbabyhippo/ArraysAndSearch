JULIETTE KANG
JK3466
README TEXT

In this submission there are 4 class files and one text files. The 4 class files are Rectangle.java, ArrayBuilder1.java, ArrayBuilder2.java and CodeFragmentTester.java. You can compile all these files by typing in <javac CLASSNAME.java> and you can run these files by typing in < java CLASSNAME >.

RECTANGLE.JAVA
This class file contains a constructor which creates the rectangle object with instance variables width and height. It also contains methods that allow subclasses of this class to access the private instance variables. One of these methods is the Compareto method, therefore this class also implements the Comparable interfaceThis code works by creating the Rectangle object which will then be referenced by Problem1.java and Problem2.java. The use of the methods allow these other classes to compare different rectangles because the methods allow these classes to access the otherwise private instance variables like height and width will can be used to find perimeter.

ArrayBuilder1
This class file creates an array and fill its with 5 rectangle objects. It uses the given findMax method to find the Rectangle with the greatest perimeter. This method extends the CompareTo interface and uses comparisons to find the object with the greatest max. Once it has found the Rectangle with the largest perimeter, it goes through a series of if-statements to print out a statement back to the user detailing the information of the object. I used these if-statements because at first it was simply printing the code-name of these objects, which cannot be understood by the user. 

ArrayBuilder2
This class file creates an array and fill its with 5 rectangle objects. It uses the a binarySearch method to find a specific Rectangle. This method extends the CompareTo interface and uses comparisons to conduct a recursive Binary Search. The binarySearch recursive algorithm with three “else if” statements. The first is if the the object is found in the middle, the second is if the object has a perimeter less than the middle object’s perimeter and the third is if the object has a perimeter greater than the middle object’s perimeter. 

CodeFragmentTester
This class file runs a test on three given code fragments. It employs a while loop to test various values of n. At the end of each loop, 5 is added to n and the loop continues until n is greater than or equal to 25. Moreover, this code also tests the run time of each fragment by finding the time before hand, finding the time after and then subtracting the two to find the total time. 


