//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		
		// O(n).... 
// 		long  ans=1;
// 		for(long i=1;i<=x;i++)
// 		{
// 		    if(i*i<=x)
// 		    {
// 		        ans=i;
// 		    }
// 		    else{
// 		        break;
// 		    }
// 		}
// 		return ans;
//......................................................................

  // O(log n)
   
   long low=1;
   long high=x;
   long ans=0;
   long mid=low+(high-low)/2;
   while(low<=high)
   {
       if(mid*mid<=x)
       {
           ans=mid;
           low=mid+1;
           
       }
       else{
           high=mid-1;
       }
       mid=low+(high-low)/2;
   }
   return ans;
		
	 }
}
