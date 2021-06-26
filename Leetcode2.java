class Solution { 
    //brute force  
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int distance = 0;     
            for(int j = i + 1; j < arr.length; j++){
                if(temperatures[j] > temperatures[i]){
                    distance = j-i;
                    break;
                }
            }
            arr[i] = distance;
        }   
        return arr;
    }
}
