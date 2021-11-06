class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(target - nums[i]) == null || map.get(target - nums[i]) == i) continue;
            return new int[]{i, map.get(target-nums[i])};
        }
        return new int[]{};
    }
}
