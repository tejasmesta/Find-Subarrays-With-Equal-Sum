class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = nums.length;
        
        for(int i=1;i<n;i++)
        {
            int sum = nums[i] + nums[i-1];
            map.put(sum,map.getOrDefault(sum,0)+1);
            if(map.get(sum)>=2)
            {
                return true;
            }
        }
        
        return false;
    }
}
