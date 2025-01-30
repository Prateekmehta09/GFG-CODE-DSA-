//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        // int[] arr=new int[26];
        
        // for(int i=0;i<s.length();i++)
        // {
        //     int ch=s.charAt(i)-'a';
            
        //     arr[ch]++;
        // }
        
        // for(int i=0;i<s.length();i++)
        // {
            
        //     int ch = s.charAt(i) - 'a';
        //     if (arr[ch] == 1) {
        //         return s.charAt(i);
        //     }
        // }
        // return '$';
         boolean flag=true;
       for(char c:s.toCharArray())
{
             // if index from starting is same as index at ending return character.
           if(s.indexOf(c)==s.lastIndexOf(c)){
               return c;
           }
       }
       
        return '$';
        
    
        
        
    
}
}
