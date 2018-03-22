package brightone.pl.zadanie.newProject2;

import brightone.pl.zadanie.newProject2.piece.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private final Color color;
    private List<Piece> pieces = new ArrayList<>();

    public Player(Color color) {
        this.color = color;
        if (color.equals(Color.Black)) {
            pieces = Arrays.asList(
                    new King(Color.Black, 4, 0),
                    new Queen(Color.Black, 5, 0),
                    new Rook(Color.Black, 0, 0),
                    new Rook(Color.Black, 7, 0),
                    new Bishop(Color.Black, 2, 0),
                    new Bishop(Color.Black, 5, 0),
                    new Knight(Color.Black, 1, 0),
                    new Knight(Color.Black, 6, 0));
            for (int x = 0; x < 8; x++) {
                pieces.add(new Pawn(Color.Black, x, 1));
            }
        }
        if (color.equals(Color.White)) {
            pieces = Arrays.asList(
                    new King(Color.White, 4, 7),
                    new Queen(Color.White, 5, 7),
                    new Rook(Color.White, 0, 7),
                    new Rook(Color.White, 7, 7),
                    new Bishop(Color.White, 2, 7),
                    new Bishop(Color.White, 5, 7),
                    new Knight(Color.White, 1, 7),
                    new Knight(Color.White, 6, 7));
            for (int x = 0; x < 8; x++) {
                pieces.add(new Pawn(Color.White, x, 6));
            }
        }
    }

    public List<Piece> getPieces() {
        return pieces;
    }
}
