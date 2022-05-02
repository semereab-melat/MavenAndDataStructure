package datastructure;

import java.util.Arrays;

/***************************************************************
 Filename: 
 Created by: melat
 Created on: 02/05/2022
 Comment: 
 ***************************************************************/
public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board  = new char[3][3];

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                board[i][j] = '-';
            }
        }

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        System.out.println(Arrays.deepToString(board));
    }
}
