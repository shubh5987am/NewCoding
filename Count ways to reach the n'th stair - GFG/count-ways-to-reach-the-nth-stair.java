//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
       return  findsteps(n,dp);
    }
    
    int findsteps(int n,int[]dp)
    {
       if(n==0 || n==1)
       return 1;
       if(dp[n]!=-1)
       return dp[n];
       else{
           return dp[n]=(findsteps(n-1,dp)+findsteps(n-2,dp))%1000000007;
       }
    }
}

