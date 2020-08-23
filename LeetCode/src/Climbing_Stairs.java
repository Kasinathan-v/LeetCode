class Solution {
    // Recursion
//     public int steps(int start,int end)
//     {
//         if(start==end)
//         {
//             return 1;
//         }
//         if(start>end)
//         {
//             return 0;
//         }
        
//         return steps(start+1,end)+steps(start+2,end);
//     }
    
    
    public int climbStairs(int n) {
        int arr[]= new int[n+1];
        arr[1]=1;
        
        if(n>1)
        arr[2]=2;
        
        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        
        return arr[n];
            
        
        // return steps(0,n); For recursion.
        
    }
}