class Solution {
    public boolean checkZeroOnes(String s) {
        //1 counter
        int oneCount = 0;
        int zeroCount = 0;
        int oneMax = 0;
        int zeroMax = 0;
        for(int i = 0; i < s.length(); i++){
            oneCount++;
            zeroCount++;
            if(s.charAt(i) == '0') oneCount = 0;
            if(s.charAt(i) == '1') zeroCount = 0;
            if(oneCount > oneMax) oneMax = oneCount;
            if(zeroCount > zeroMax) zeroMax = zeroCount;
        }
        return oneMax > zeroMax;
    }
}
