//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] element = line.trim().split("\\s+");
            int sizeOfArray = Integer.parseInt(element[0]);
            int K = Integer.parseInt(element[1]);

            int arr[] = new int[sizeOfArray];

            line = br.readLine();
            String[] elements = line.trim().split("\\s+");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution obj = new Solution();
            int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        HashMap<Integer,Integer> ap=new HashMap<>();
        
        int sum=0;
        int mx=0;
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
            if(sum==K)
            {
                mx=Math.max(mx,i+1);
            }
            if(ap.containsKey(sum-K))
            {
                mx=Math.max(mx,i-ap.get(sum-K));
            }
            if(!ap.containsKey(sum))
            {
                ap.put(sum,i);
            }
        }
        return mx;
    }
}


// HashMap<Integer,Integer> mp=new HashMap<>();
      
        // int summation=0;
        // int mx=0;
        // for(int i=0;i<N;i++)
        // {
        //     summation+=A[i];
        //   if(summation==K)
        //   {
        //       mx=Math.max(mx, i+1);
        //   }
        //   if(mp.containsKey(summation-K))
        //   {
        //       mx=Math.max(mx, i-mp.get(summation-K));
        //   }
        //   if(!mp.containsKey(summation))
        //   mp.put(summation,i);
        // }
        // return mx;