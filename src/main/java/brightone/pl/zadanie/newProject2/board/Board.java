package brightone.pl.zadanie.newProject2.board;

import brightone.pl.zadanie.newProject2.Game;

public class Board {
    private static Spot[][] table;

    public Board() {
        table = new Spot[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                table[x][y] = new Spot();
            }
        }
    }

    protected static void printTable(Game game) {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(table[x][y].getContent() + "  ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

}
