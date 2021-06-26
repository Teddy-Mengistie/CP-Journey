class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        List<Integer> numbers = new ArrayList<Integer>();
        for(int n: nums){
            numbers.add(n);
        }
        output.add(numbers);
        addAllSubsets(output, nums);
        return output;
    }
    public void addAllSubsets(List<List<Integer>> output, int[] arr){
        if(arr.length == 0) return;
        for(int i = 0; i < arr.length; i++){
            int[] array = new int[arr.length - 1];
            List<Integer> list = new ArrayList<Integer>();
            int k = 0;
            for(int j = 0; j < arr.length; j++){
                if(j == i) continue;
                array[k] = arr[j];
                list.add(arr[j]);
                k++;
            }
            if(output.contains(list)) continue;
            output.add(list);
            addAllSubsets(output, array);
        }
    }
}
