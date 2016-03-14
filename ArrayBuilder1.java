//Juliette Kang
// JK3466
// ArrayBuilder.java - this class creates an array of rectangle objects and finds the largest rectangle based on its perimeter 


import java.util.Arrays;

public class ArrayBuilder
{
        public static void main(String args[])
        {
                // create the array //
                Rectangle [] rectArray;
                rectArray = new Rectangle[5];

		// fill the array with 5 rectangles //
                rectArray[0] = new Rectangle (5, 5);
                rectArray[1] = new Rectangle (10, 6);
                rectArray[2] = new Rectangle (4, 7);
                rectArray[3] = new Rectangle (6, 8);
                rectArray[4] = new Rectangle (11, 13);

                Rectangle x = findMax(rectArray);

		// the following fragments ensure that the interface prints out understandable data back to the user on which object has the greater perimeter //

                if (x == rectArray[0])
                {
                System.out.println("The rectangle with the greatest perimeter is: rectangle 1, 5x5");
                }

                if (x == rectArray[1])
                {
                System.out.println("The rectangle with the greatest perimeter is: rectangle 2, 10x6");
                }


                if (x == rectArray[2])
                {
                System.out.println("The rectangle with the greatest perimeter is: rectangle 3: 4x7");
                }

                 if (x == rectArray[3])
                {
                System.out.println("The rectangle with the greatest perimeter is: rectangle 4: 6x8");
                }

                if (x == rectArray[4])
                {
                System.out.println("The rectangle with the greatest perimeter is: rectangle 5: 11x13");
                }

        }


	// extends Comparable interface to find the greatest perimeter by comparing objects //
        public static <AnyType extends Comparable<AnyType>>  AnyType findMax(AnyType[] arr)
        {
                int maxIndex = 0;
                for (int i = 1; i < arr.length; i++)
                    if ( arr[i].compareTo(arr[maxIndex]) > 0 )
                        maxIndex = i;
                return arr[maxIndex];
        }


      
}

