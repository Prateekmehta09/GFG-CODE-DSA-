//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String s) {
        // code here
         long ans = -1;
        String[] words = s.split(" "); 
        
        for (String word : words) {
            if (isNumber(word) && !word.contains("9")) {
               
                long num = Long.parseLong(word);
                ans = Math.max(ans, num); 
            }
        }
        
        return ans;
    }
    
    private boolean isNumber(String word) {
      
        for (char c : word.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; 
            }
        }
        return true;
    }
}