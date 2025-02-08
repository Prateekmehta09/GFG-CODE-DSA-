//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;


// } Driver Code Ends
class Solution {
    public String maximumFrequency(String s) {
        // Your Code goes here
         String[] arr = s.split(" "); // Split by spaces to get words
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        int max = 0;  // Start from 0, not 1
        String maxi = "";

        for (String word : arr) {
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > max) {  // Finding the word with the highest frequency
                max = entry.getValue();
                maxi = entry.getKey();
            }
        }

        return maxi + " " + max; 
      
        
     
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            Solution sol = new Solution();
            System.out.println(sol.maximumFrequency(str));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends