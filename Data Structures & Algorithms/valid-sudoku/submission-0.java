class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9]; //box # and whether digit # has been seen

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int ind = board[i][j] - '1'; //number as index
                int box = (i/3) * 3 + (j/3);
                if(rows[i][ind] || cols[j][ind] || boxes[box][ind]){
                    return false;
                }
                rows[i][ind] = true;
                cols[j][ind] = true;
                boxes[box][ind] = true;
            }
        }
        return true;
    }
}
