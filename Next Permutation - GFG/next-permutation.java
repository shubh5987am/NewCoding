//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int indx1=-1;
        int indx2=-1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=N-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                indx1=i;
                break;
            }
        }
        if(indx1==-1)
        {
            reverse(arr,0);
            //list.add(reverse);
        }
        else{
            for(int i=N-1;i>=0;i--)
            {
                if(arr[indx1]<arr[i])
                {
                    indx2=i;
                    break;
                }
            }
            swap(arr,indx1,indx2);
            reverse(arr,indx1+1);
            //list.add(reverse);
            
        }
        for(int k=0;k<N;k++)
        {
            list.add(arr[k]);
        }
        return list;
    }
        
        public static void swap(int arr[],int i,int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        public static void reverse(int arr[],int start)
        {    int i=start;
            int j=arr.length-1;
            while(i<j)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
    
}