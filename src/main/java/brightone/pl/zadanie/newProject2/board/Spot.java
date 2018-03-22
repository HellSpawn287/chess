package brightone.pl.zadanie.newProject2.board;

import brightone.pl.zadanie.newProject2.piece.Piece;
import brightone.pl.zadanie.newProject2.piece.Type;

public class Spot {
    private Piece piece;
    private Type content;

    Spot() {
        if (piece != null) this.content = piece.getType();
        else {
            this.content = Type.Empty;
        }
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Type getContent() {
        return content;
    }
}