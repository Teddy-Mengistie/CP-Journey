class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int n = x;
        int rev = 0;
        while (n > 0){
            rev *= 10;
            rev += n%10;
            n/= 10;
        }
        return (x == rev);
    }
}
