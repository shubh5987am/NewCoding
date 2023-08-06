//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	
	
	public int minOperations(String str1, String str2) 
	{ 
	   
	  int m=str1.length();
	  int n=str2.length();
	  int dp[][]=new int[m+1][n+1];
	  for(int i=0;i<=m;i++)
	  {
	      for(int j=0;j<=n;j++)
	      {
	          dp[i][j]=-1;
	      }
	  }
	  int ans= lcsUtil(m,n,str1,str2,dp);
	  return ans;
	}
	  
	  public static int lcsUtil(int m,int n,String str1,String str2,int dp[][])
	  {
	 
	  if(m==0)
	  return n;
	  if(n==0)
	  return m;
	    if(dp[m][n]!=-1)
	    return dp[m][n];
	    
	    if(str1.charAt(m-1)==str2.charAt(n-1))
	    {
	        return dp[m][n]=lcsUtil(m-1,n-1,str1,str2,dp);
	    }
	    else{
	        dp[m][n]=1+Math.min(lcsUtil(m-1,n,str1,str2,dp),lcsUtil(m,n-1,str1,str2,dp));
	        return dp[m][n];
	    }
	    
	  }
	 
	    
}