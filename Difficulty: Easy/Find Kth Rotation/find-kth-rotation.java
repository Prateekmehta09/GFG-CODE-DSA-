//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        // int  n=arr.size();
        // int s=0;
        // int e=arr.size()-1;
        // int ans=0;
        // while(s<=e)
        // {
        //     int m=s+(e-s)/2;
            
        //     int next=(m+1)%n;
            
        //     int prev=(m+n-1)%n;
            
        //     if(arr.get(m)<=arr.get(prev)&& arr.get(m)<=arr.get(next)){
        //         ans=m;
                
        //     }
        //     else if(arr.get(s)<=arr.get(m))
        //     {
        //         e=m-1;
        //     }
        //     else if(arr.get(e)>=arr.get(m))
        //     {
        //         s=m+1;
        //     }
            
        // }
        // return ans;
         int low = 0;
        int high = arr.size() - 1;
        int ans = 0;
        while(low<high){
            int mid=low+(high-low)/2;
         if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low; 
    
    }
}