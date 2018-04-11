package brightone.pl.zadanie.newProject2.board;

import brightone.pl.zadanie.newProject2.Game;
import brightone.pl.zadanie.newProject2.piece.Empty;

public class Board {
    private static Spot[][] table;
    private Game game = new Game();

    public Board() {
        table = new Spot[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                table[y][x] = new Spot(game.getWhitePieces().get(x));
            }
            for (int y = 2; y < 6; y++) {
                table[y][x] = new Spot(new Empty());
            }
            for (int y = 6; y < 8; y++) {
                table[y][x] = new Spot(game.getBlackPieces().get(x));
            }
        }
    }

    public static Spot[][] getTable(Game game) {
        return table;
    }

    public static void setTable(Spot[][] table) {
        Board.table = table;
    }

    public void printTable() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(table[x][y].getContent() + "  ");
            }
            System.out.println(" \n ");
        }
        System.out.println(" ");
    }
}
