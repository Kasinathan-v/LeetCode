class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
           // System.out.println(sum);
            if(sum<=0 || sum<nums[i])
            {   
                //System.out.println(nums[i]+" inside");
                sum=nums[i];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}