class Solution {
 public double median(int[] nums1, int[] nums2)
    {
        if(nums1.length>nums2.length)
        {
          return  median(nums2,nums1);
        }
        int x=nums1.length;
        int y=nums2.length;

        // System.out.println(x+" "+y);
        int low=0;
        int high=x;
        
        while(low<=high)
        {
            int partitionx = (low+high)/2;
            int partitiony = (x+y+1)/2-partitionx;
            System.out.println(partitionx+" "+partitiony);
            int l1 = (partitionx==0) ? Integer.MIN_VALUE : nums1[partitionx-1];
            int r1= (partitionx==x) ? Integer.MAX_VALUE : nums1[partitionx];
            
            int l2 = (partitiony==0) ? Integer.MIN_VALUE : nums2[partitiony-1];
            int r2= (partitiony==y) ? Integer.MAX_VALUE : nums2[partitiony];
            
            if(l1<=r2 && l2<=r1)
            {
                if((x+y)%2==0)
                {
                    return(double) (Math.max(l1,l2)+Math.min(r1,r2))/2;
                }
                else
                {
                    // System.out.println(l1+" "+l2);
                    return (double)Math.max(l1,l2);
                }
            }
            
            else
            {
                if(l1>r2)
                {
                    high=partitionx-1;
                }
                else
                {
                    low=partitionx+1;
                }
            }
        }
        return -1;
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        return median(nums1,nums2);        
    }
}