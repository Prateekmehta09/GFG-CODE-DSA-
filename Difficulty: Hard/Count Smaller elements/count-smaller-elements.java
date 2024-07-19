//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int arr[] = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int[] ans = new Solution().constructLowerArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
     int binarysearch(ArrayList<Integer> arr,int key)
     {
        int ind=1;
        int left=0,right=arr.size()-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr.get(mid)==key)
            {
                ind=mid;
                right=mid-1;
            }
            else if(arr.get(mid)>key) right=mid-1;
            else left=mid+1;
        }
        return ind;
    }
    
    int[] constructLowerArray(int[] arr) {
        // code here
       ArrayList<Integer> temp=new ArrayList<>();
       int[] ans=new int[arr.length];
       for(int i:arr){
           temp.add(i);
           
       }
       Collections.sort(temp);
       for(int i=0;i<arr.length;i++)
       {
           int ind=binarysearch(temp,arr[i]);
           ans[i]=ind;
           temp.remove(ind);
           
       }
       return ans;
    }
}