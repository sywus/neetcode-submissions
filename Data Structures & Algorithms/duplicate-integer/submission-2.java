// googled: create a set from array of ints java
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> distinctNums = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        return distinctNums.size() != nums.length;
    }
}