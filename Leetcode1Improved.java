class Solution {
  public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ret = new ArrayList<>();
        help(0, nums, ret, new ArrayList<>());
        return ret;
    }
    public void help(int index, int[] nums, List<List<Integer>> list, List<Integer> curr){
        if(index == nums.length){
            list.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[index]);
        help(index + 1, nums, list, curr);
        curr.remove(curr.size()-1);
        help(index + 1, nums, list, curr);
    }
} 
