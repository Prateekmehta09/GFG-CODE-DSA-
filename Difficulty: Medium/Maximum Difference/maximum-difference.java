//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        Stack<Integer>st = new Stack<>();
        int ans = 0;
        for(int rightSmaller:arr)
        {
            while(!st.isEmpty() && st.peek()>rightSmaller)
            {
                int current = st.pop();
                int leftSmaller = 0;
                while(!st.isEmpty() && st.peek()==current)
                {
                    st.pop();
                }
                leftSmaller = (st.isEmpty()?0:st.peek());
                ans = Math.max(ans,(int)Math.abs(rightSmaller-leftSmaller));
            }
            st.push(rightSmaller);
        }
        while(!st.isEmpty())
        {
                int current = st.pop();
                if(!st.isEmpty() && st.peek()==current)
                {
                    continue;
                }
                int leftSmaller = (st.isEmpty()?0:st.peek());
                ans = Math.max(ans,leftSmaller);
        }
        return ans;
    }
}
