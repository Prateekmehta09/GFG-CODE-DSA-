//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> Arr=new ArrayList<>();
        int one=firstfind(arr,n,x);
        int two=lastfind(arr,n,x);
        
        if(one==-1){
            Arr.add(-1);
            return Arr;
        }
        
        Arr.add(one);
        Arr.add(two);
        
        return Arr;
        
       
    }
    
    public int firstfind(int arr[],int n,int x)
    {
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
                res=mid;
                end=mid-1;
               
                
            }
            
            else if(arr[mid]>x){
                end=mid-1;
                
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
    public int lastfind(int arr[],int n,int x)
    {
        int start=0;
        int end=arr.length-1;
        int res1=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
                res1=mid;
                start=mid+1;
             
                
            }
            
            else if(arr[mid]<x){
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
        }
        return res1;
    }
}
