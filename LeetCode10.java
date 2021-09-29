class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set;
        for(int i = 0; i < board.length; i++){
            set = new HashSet();
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.' && !set.add(board[i][j])) return false;
            }
        }
        
        // check each col
        for(int i = 0; i < board.length; i++){
            set = new HashSet();
            for(int j = 0; j < board[i].length; j++){
               if(board[j][i] != '.' && !set.add(board[j][i])) return false; 
            }
        }
        
        // check each box
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){
                set = new HashSet();
                for(int k = i*3; k < (i+1)*3; k++){
                    for(int l = j*3; l < (j+1)*3; l++){
                        if(board[k][l] != '.' && !set.add(board[k][l])) return false;
                    }
                }
            }
        }
        return true;
    }
}
