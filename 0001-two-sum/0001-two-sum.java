class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;

        for ( int i = 0; i < size -1; i++){
            int diff = target - nums[i];
            for( int j = i + 1; j < size; j++){
                if(nums[j] == diff){
                    return new int[]{i,j};
                }
            } 
        }
        return new int[]{};
    }
}