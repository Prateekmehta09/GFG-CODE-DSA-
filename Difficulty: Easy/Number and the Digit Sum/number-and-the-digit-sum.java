//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
    		System.out.println (new Sol().numberCount (n, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static long numberCount (long N, long K)
    {
        // your code here
        long count=0;
        if(N<=9)
        return 0;
        
        else{
            for(int i=10;i<=N;i++)
            {
                if(i-sumOfDigit(i)>=K)
                {
                   count++;
                }
            }
        }
        return count;
    }
    
    public static long sumOfDigit(long N)
    {
        long sum=0;
       
 
        while (N != 0) {
            sum = sum + N % 10;
            N = N / 10;
        }
 
        return sum;
    }
    
}