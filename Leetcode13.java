class Solution {
    public int percentageLetter(String s, char letter) {
        int charCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter) charCount ++;
        }
        return (int) (((double)charCount/s.length()) * 100);
    }
}
