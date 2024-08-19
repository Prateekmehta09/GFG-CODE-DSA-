//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, key));
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
              // Your code here
     margeSort(arr,0,arr.length-1); 
       
        return arr[k-1];
    }
    private static void margeSort(int[] arr, int s, int e){
        if(s < e){
            int m = s + (e - s)/2;
            margeSort(arr,s,m);
            margeSort(arr,m+1,e);
        
         marge(arr,s,m,e);
        }
    }
    private static void marge(int[] arr,int s,int m,int e){
        int[] merge = new int[e-s+1];
        int x = 0;
        int i = s;
        int j = m + 1;
        int k=0;
        while(i <= m && j <= e){
            if(arr[i] <= arr[j]){
                merge[x++] = arr[i++];
            }else{
                merge[x++] = arr[j++];
            }
        }
        
        
        while(i <= m){
            merge[x++] = arr[i++];
        }
        
        while(j <= e){
            merge[x++] = arr[j++];
        }
        
      for(int l=0; l<merge.length; l++){
          arr[s+l] = merge[l];
      }
    }
}
