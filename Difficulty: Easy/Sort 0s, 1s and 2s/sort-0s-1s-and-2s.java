//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int start=0;
        int mid=0;
        int end=arr.length-1;
        
        while(mid<=end)
        {
            if(arr[mid]==0)
            {
               if (start != mid) {
                    int temp = arr[start];
                    arr[start] = arr[mid];
                    arr[mid] = temp;
                   
               }
                    
                start++;
                mid++;
                
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                 if (mid != end) {
                    int temp = arr[mid];
                    arr[mid] = arr[end];
                    arr[end] = temp;
                }
                end--;
            }
        }
    }
    // public void swap(int a,int b)
    // {
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
}

//{ Driver Code Starts.
// } Driver Code Ends