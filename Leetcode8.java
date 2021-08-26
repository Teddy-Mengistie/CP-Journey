class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0 || (x < 10 && x > 0)) return true;
        if(x < 0 || x%10 == 0) return false;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int n = x;
        int len = 0;
        while (n > 0){
            len ++;
            n /= 10;
        }
        while(stack.size() < len/2){
            stack.push(x%10);
            x/= 10;
        }
        if(stack.peek() != x%10) x/= 10;
        while(x > 0 && stack.size() > 0){
            if(x %10  != stack.peek()) return false;
            stack.pop();
            x/= 10;
        }
        return true;
    }
}
