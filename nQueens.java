
import java.util.*;

public class nQueens {

    public static boolean isSafe(char board[][] ,int row, int col) {
        //vertical up
        for(int i = row-1 ; i >= 0 ;i-- ){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diag left up
        for(int i = row -1 ,j = col -1; i >= 0 && j >= 0 ; i-- ,j--){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
        
        //dig rt up
        for(int i = row -1 ,j = col +1; i >= 0  &&  j < board.length ; i-- , j++){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
        
        return true;

    }
    

    public static void nqueens(char board[][] ,int row) {
        //condition
        if(row == board.length){
            printBoard(board);
            return;
        }
        //recurtion 
        for(int j = 0 ; j <board.length ; j++){
            if(isSafe (board ,row, j) ){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = 'X'; //backtracking
            }
        }
        }

        public static void printBoard(char board[][]) {
            System.out.println("----------------------------");
            for(int i = 0 ; i < board.length; i++){
                for(int j = 0 ; j < board.length ; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        char board[][] = new char[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        nqueens(board , 0);
    }
}

 