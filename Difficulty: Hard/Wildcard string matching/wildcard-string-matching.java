//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean match(String wild, String pattern)
    {
        // code here
        StringBuilder ans=new StringBuilder();
        
        for(char c : wild.toCharArray())
        {
            if(c == '*')
            {
                ans.append(".*");
            }
            else if (c == '?') {
                ans.append(".");  
            } else {
                ans.append("\\Q").append(c).append("\\E"); 
            }
        }
        
        return pattern.matches(ans.toString());
            
        }
    
}