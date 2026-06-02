class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(seenNumbers.contains(nums[i]))
            {
                return true;
            }
            seenNumbers.add(nums[i]);
        }  
        return false;
        
    }
}