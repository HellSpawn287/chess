package brightone.pl.zadanie.newProject2.board;

import brightone.pl.zadanie.newProject2.piece.Piece;
import brightone.pl.zadanie.newProject2.piece.Type;

public class Spot {
    private Piece piece;
    private String content;

    Spot(Piece piece) {
        this.piece = piece;
        if (piece != null) this.content = piece.getType().getSymbolType() + piece.getColor().getSymbolColor();
        else {
            this.content = Type.Empty.getSymbolType();
        }
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    String getContent() {
        return content;
    }
}