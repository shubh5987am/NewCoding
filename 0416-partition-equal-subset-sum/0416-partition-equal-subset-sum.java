class Solution {
    public boolean canPartition(int[] nums) {
        int totSum=0;
        int N=nums.length;
        for(int i=0;i<N;i++)
        {
           totSum+=nums[i]; 
        }
        if(totSum%2!=0)
        {
            return false;
        }
        int target=totSum/2;
        return isSubsetSum(nums,N,target);
    }
    public boolean isSubsetSum(int nums[],int N,int sum)
    {
       boolean [][]dp=new boolean[N+1][sum+1];
        for(int i=0;i<=N;i++)
        {
         dp[i][0]=true;
        }
        
        for(int i=1;i<=N;i++)
        {
          for(int j=1;j<=sum;j++)
         {
              if(nums[i-1]<=j)
              {
                dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i-1]];
              }
              else{
                  dp[i][j]=dp[i-1][j];
              }
          }
        }
        return dp[N][sum];
    }
}