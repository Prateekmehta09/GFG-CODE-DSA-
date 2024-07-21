//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) list.add(sc.nextInt());

            Solution obj = new Solution();
            long ans = obj.findMaxProduct(list);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // code here
    //     int mod=1000000007;
        
    //   Collections.sort(arr);
    //     int pos=0;
    //     int neg=0;
    //     int zero=0;
    //     long posmul=1;
    //     long negmul=1;
    //     long ans=1;
    //     if(arr.size()==1)return arr.get(0);
        
    //     for(int i=0;i<arr.size();i++)
    //     {
    //         if(arr.get(i)<0)
    //         {
    //             negmul=(negmul*arr.get(i))%mod;
    //             neg++;
    //         }
    //         else if(arr.get(i)==0)
    //         {
    //             zero++;
    //         }
    //         else{
    //             posmul=(posmul*arr.get(i))%mod;
    //             posmul++;
    //         }
            
    //     }
    //      if (pos > 0)
    //      {
    //         ans = (ans * posmul) % mod;
    //     }

    //     if (neg > 0) 
    //     {
    //         if (neg == 1)
    //         {
    //             if (pos > 0) 
    //             {
    //                 return ans;
    //             } else if (zero > 0) {
    //                 return 0;
    //             } else {
    //               return arr.get(0);
    //             }
    //         } 
    //         else if (neg % 2 == 0) 
    //         {
    //             ans = (ans * negmul) % mod;
    //             return ans;
    //         } 
    //         else 
    //         {
    //             for (int i = 0; i < neg - 1; i++) 
    //             {
    //                 ans = (ans * arr.get(i)) % mod;
    //             }
    //             return ans;
    //         }
    //     }
    //     if(pos==0 && neg==0)return 0;
    //     return ans;
    // }
     long maxProduct = 1;
        long minNegative = Long.MAX_VALUE;
        int countNegative = 0;
        int countZero = 0;
        long productWithoutZero = 1;
        final int MOD = 1000000007;
        if (arr.size() == 1) {
            return arr.get(0);
        }

        for (int num : arr) {
            if (num == 0) {
                countZero++;
                continue;
            }
            if (num < 0) {
                countNegative++;
                minNegative = Math.min(minNegative, Math.abs((long)num));
            }
            productWithoutZero =(productWithoutZero* num)% MOD;
        }
        if (countZero == arr.size()) {
            return 0;
        }
        if (productWithoutZero > 0) {
            return productWithoutZero;
        }
        if (countNegative == 1 && countZero + countNegative == arr.size()) {
            return 0;
        }
        return productWithoutZero / (-minNegative);
    }
    
}