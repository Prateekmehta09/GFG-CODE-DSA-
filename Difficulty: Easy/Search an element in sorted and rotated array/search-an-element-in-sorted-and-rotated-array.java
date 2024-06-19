//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    // code here
	       int s=0;
    int x=array.length-1;
    int l=array.length-1;
    while(s<=l){
        int mid=(s+l)/2;
        if(array[mid]==target){
            return mid;
        }
        if(array[mid]<array[x]){
            if(target>array[mid] && target<=array[x]){
                s=mid+1;
            }
            else
            l=mid-1;
        }
        else{
        if(target>=array[s] && target<array[mid]){
            l=mid-1;
        }
        else
        s=mid+1;
        }
    }
    return -1;
	}
} 

