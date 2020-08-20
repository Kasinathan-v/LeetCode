class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> num = new HashMap<>();
        int arr[]= new int[2];
        
        for(int j=0;j<nums.length;j++)
        {
            try
            {
                
                int p=num.get(target-nums[j]);
                
                arr[0]=j;
                arr[1]=p;
                return arr;
                
            }
            catch(Exception e)
            {
                
            }
            num.put(nums[j],j);
        }
        return arr;
    }
}