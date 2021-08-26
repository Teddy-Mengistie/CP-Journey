class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int n = x;
        while (n > 0){
            queue.offer(n % 10);
            n /= 10;
        }
        while(x > 0){
            if(queue.removeLast() != x%10) return false;
            x/=10;
        }
        return true;
    }
}
