/*
package brightone.pl.zadanie.nodes;


public class Chessboard {
    private static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private String[][] chessBoard;

    public Chessboard() {
        this.chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            String[] row = chessBoard[i];
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = letters[i] + (j + 1);
            }
        }
    }

    public static String[] getLetters() {
        return letters;
    }

    public static void setLetters(String[] letters) {
        Chessboard.letters = letters;
    }

    static void printBoard(String[][] board) {
        for (String[] row : board) {
            for (String field : row) {
                System.out.print(field + " ");
            }
            System.out.println();
        }
    }

    public static String getLetter(int i) {
        return letters[i];
    }

    public String[][] getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(String[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

}

*/
