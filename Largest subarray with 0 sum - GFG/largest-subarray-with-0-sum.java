// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int nums[], int n)
    {
        // Your code here
        HashMap<Integer,Integer>hs1 = new HashMap<>();
        hs1.put(0,-1); int maxLength=0; int prev=0;
        for(int i=0;i<n;i++)
        {
            prev+=nums[i];
            if(hs1.containsKey(prev))
            maxLength=Math.max(maxLength,i-hs1.get(prev));
            else
            hs1.put(prev,i);
        }
        return maxLength;
    }
}