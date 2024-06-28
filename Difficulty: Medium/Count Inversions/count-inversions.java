//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for (long i = 0; i < n; i++) arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int)n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        return divide(arr,0,n-1);
    }
    public static long divide(long arr[],int s,int e){
        long count=0;
        if(s<e)
        {
            int mid=s+(e-s)/2;
             count+=divide(arr,s,mid);
             count+=divide(arr,mid+1,e);
             count+=merge(arr,s,mid,e);
            
        }
        return count;
    }
    public static long merge(long arr[],int s,int mid,int e)
    {
        long[] merged=new long[e-s+1];
        
        int first=s;
        int second=mid+1;
         int x=0;
         long count=0;
         
         while(first<=mid && second<=e)
         {
             if(arr[first]<=arr[second])
             {
                 merged[x++]=arr[first++];
             }
             else{
                 merged[x++]=arr[second++];
                 count+=(mid-first+1);
             }
         }
              while (first <= mid) {

            merged[x++] = arr[first++];

        }

        while (second <= e) {

            merged[x++] = arr[second++];

        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {

            arr[j] = merged[i];

        }
        return count;

    }
   }
