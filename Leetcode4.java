class Solution {
    public void rotate(int[][] matrix) {
        HashSet<Pair<Integer, Integer>> visited = new HashSet<Pair<Integer, Integer>>();
        for(int i = 0 ; i < matrix.length; i ++ ){
            for(int j = 0; j < matrix[i].length; j++){
                //swap with coordinates rotated 90 degrees
                if(visited.contains(new Pair(i, j))) continue;
                
                int temp = matrix[i][j];
                int x = j+1;
                int y = i+1;
                int newX = -y + matrix.length;
                int newY = x-1;
                // System.out.println("Swapping : (" + temp + ")" + " with " + "(" + matrix[newY][newX] + ")");
                visited.add(new Pair(newY, newX));
                matrix[i][j] = matrix[newY][newX];
                matrix[newY][newX] = temp;
   
            }
       }
    }
}
