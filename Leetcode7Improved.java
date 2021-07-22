class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length], right = new int[nums.length], answer = new int[nums.length];
        left[0] = 1;
        right[right.length-1] = 1;
        // prefix product
        for(int i = 1; i < left.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        // suffix product
        for(int i = right.length-2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = right[i] * left[i];
        }
        return answer;
    }
}
