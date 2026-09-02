class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            numIndexMap.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if (numIndexMap.containsKey(diff) && numIndexMap.get(diff) != i){
                return new int[]{i, numIndexMap.get(diff)};
            }
        }
        return new int[0];
    }
}
