// Juliette Kang
// JK3466
// CodeFragmentTester.java - implement given code fragments and test them with various numbers of n and record each run time

public class CodeFragmentTester
{

        public static void main (String [] args)
        {

                // create an array //
                int [] nums = new int[100000000];


                int n = 5; // instantiate the first value of n //
                while (n < 25) // while loop so that we can test different values of n //
                {

                // code sample 1 //
            

                {
                        int sum = 0;
                       						 
                        long startTime = System.nanoTime(); // record beginning run time //
                        for ( int i = 0; i < 23; i ++)
                        {
                                for ( int j = 0; j < n ; j ++)
                                {
                                        sum = sum + 1;
                                }
                        }				
                        long endTime = System.nanoTime(); // record end run time //
                        long totalTime = endTime - startTime; // calculate final run time //
                        
                        System.out.println("_____________________________________");
                        System.out.println(" ");
                        System.out.println("Code Fragment 1: " +sum);
                        System.out.println("Runtime: " + totalTime);
                }
                



                // code sample 2 //
                {
                int sum = 0;

                long startTime = System.nanoTime(); // record beginning run time //
                for ( int i = 0; i < n ; i ++)
                {
                        for ( int k = i ; k < n ; k ++)
                        {
                                 sum = sum + 1;
                        }
                }
                long endTime = System.nanoTime(); // record end run time //
                long totalTime = endTime - startTime; // calculate run time //
                		
                System.out.println(" ");
                System.out.println("Code Fragment 2: " +sum);
                System.out.println("Runtime: " +totalTime);
                }
               



                // code sample 3 //
               
                {
                		int k = 2; // instantiate k as 2 //
                		long startTime = System.nanoTime(); // record beginning run time //

				int x = foo(n,k);
		
				long endTime = System.nanoTime(); // record end run time //
	                        long totalTime = endTime - startTime; // calculate total run time //
		                		
        	                System.out.println(" ");
                	        System.out.println("Code Fragment 3: " + x);
                
	
                	System.out.println("Runtime: " + totalTime);
                }
              


        n = n + 5; // keeps add 10 to n in the while loop //

        }

        }


        public static int foo(int n, int k) // method given by code fragment 3 //
        {

                if(n<=k)
                        return 1;
                else
                        return foo(n/k, k) + 1;
        }
}



