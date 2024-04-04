//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s1,String s2)
       {
           int arr[]= new int[26];
           int count=0;
           for(char ch : s1.toCharArray())
           {
               arr[ch-'a']++;
           }
            for(char ch : s2.toCharArray())
           {
               arr[ch-'a']--;
           }
           
           for(int i=0;i<arr.length;i++)
           {
               if(arr[i]!=0)
               {
                   count+= Math.abs(arr[i]);
               }
           }
           return count;
       }
}