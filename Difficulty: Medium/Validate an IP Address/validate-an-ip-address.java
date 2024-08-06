//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        // Write your code here
          if(str.charAt(0)=='0')return false;
        String[] array = str.split("\\.");
        if(array.length!=4)return false;
        // for(int i=0;i<array.length-1;i++){
        // System.out.println(array[i]);
        // }
        for(String st : array) 
        {
           
           
               
               if(st.isEmpty())return false;
                int num = Integer.parseInt(st);
                if (num < 0 || num > 255)
                {
                    return false;
                }
            
        }
        return true;
        
    }
}