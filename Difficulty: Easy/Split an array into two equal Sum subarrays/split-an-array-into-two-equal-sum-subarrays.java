//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public boolean canSplit(int arr[]) {
        // code here
          int n = arr.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        int currentsum=0;
        for(int i=0;i<n;i++){
            totalsum-=arr[i];
            currentsum+=arr[i];
            if(totalsum==currentsum){
                return true;
            }
        }
        return false;
    }
}