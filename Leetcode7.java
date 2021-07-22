class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return new int[]{};
        int[] answer = new int[nums.length];
        int ans1 = 1;
        for(int i = 0; i < nums.length; i++){
            if(i > 0) ans1*=nums[i];
        }
        answer[0] = ans1;
        for(int i = 1; i < answer.length; i++){
            if(nums[i] == 0){
                // O(n)
                answer[i] = prodFor(i, nums);
                continue;
            }
            answer[i] = answer[i-1] / nums[i] * nums[i-1];
        }
        return answer;
    }
    public int prodFor(int index, int[] nums){
        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            if(i != index) prod *= nums[i];
        }
        return prod;
    }
}
