class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] dist = new int[capacity.length];
        for(int i = 0; i < capacity.length; i++){
            dist[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(dist);
        int bagCount = 0;
        for(int i = 0; i < capacity.length; i++){
            if(additionalRocks < 0) continue;
            if(dist[i] <= additionalRocks){
                bagCount++;
            }
            additionalRocks -= dist[i];
        }
        return bagCount;
    }
}
