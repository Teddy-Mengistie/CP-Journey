class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret = new int[nums2.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int i = 0; i < ret.length; i++) ret[i] = -1;
        for(int i = 0; i < nums2.length; i++) {
            while(stack.size() > 0 && nums2[i] > nums2[stack.peek()]){
                int ind = stack.pop();
                ret[ind] = nums2[i];
            }
            stack.push(i); 
            map.put(nums2[i], i);
        }
        
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = ret[map.get(nums1[i])];
        }
        return nums1;
        /*
        ret = {a bunch of -1s}
        Map (nums2[i] with i) and simultaneously get the nearest greater number for every element in nums2
        copy over to nums 1 and go through and set each element to ret[map.get(nums[i])]
        return nums1
        */
    }
}
