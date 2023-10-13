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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        
        String str="";
        for(int i=S.length()-1;i>=0;i--)
        {
            char ch=S.charAt(i);
            str+=ch;
        }
        int m=S.length();
        int n=str.length();
        int dp[][]=new int[m+1][n+1];
        return lcsUtil(S,str,dp);
    }
    
    public int lcsUtil(String S,String str,int dp[][])
    {
         int m=S.length();
        int n=str.length();
        
        if(m==0 || n==0)
        return 0;
        
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(S.charAt(i-1)==str.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}