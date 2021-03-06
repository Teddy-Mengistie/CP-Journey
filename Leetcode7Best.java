class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for(int i = 1; i < answer.length; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i = answer.length-1; i >= 0; i--){
            answer[i] = right * answer[i];
            right = right * nums[i];
        }
        return answer;
    }
}
