class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] newArr = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<Integer>();        
        // scuffed O(n)
        for(int i = 0; i < temperatures.length; i++){
            while(stack.size() > 0 && temperatures[i] > temperatures[stack.peek()]){
                int rm = stack.pop();
                newArr[rm] = i-rm;
            }
            stack.push(i);
        }
        return newArr;
    }
}
