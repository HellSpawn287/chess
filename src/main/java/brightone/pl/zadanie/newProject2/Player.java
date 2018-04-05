package brightone.pl.zadanie.newProject2;

import brightone.pl.zadanie.newProject2.piece.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
                    new Knight(Color.Black, 6, 0),
                    new Pawn(Color.Black, 0, 1),
                    new Pawn(Color.Black, 1, 1),
                    new Pawn(Color.Black, 2, 1),
                    new Pawn(Color.Black, 3, 1),
                    new Pawn(Color.Black, 4, 1),
                    new Pawn(Color.Black, 5, 1),
                    new Pawn(Color.Black, 6, 1),
                    new Pawn(Color.Black, 7, 1)
            );
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
                    new Knight(Color.White, 6, 7),
                    new Pawn(Color.White, 0, 6),
                    new Pawn(Color.White, 1, 6),
                    new Pawn(Color.White, 2, 6),
                    new Pawn(Color.White, 3, 6),
                    new Pawn(Color.White, 4, 6),
                    new Pawn(Color.White, 5, 6),
                    new Pawn(Color.White, 6, 6),
                    new Pawn(Color.White, 7, 6)
                    );
        }
    }

    List<Piece> getPieces() {
        return pieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return color == player.color &&
                Objects.equals(getPieces(), player.getPieces());
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, getPieces());
    }
}
