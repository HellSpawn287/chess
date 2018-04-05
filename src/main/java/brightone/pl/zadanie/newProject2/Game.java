package brightone.pl.zadanie.newProject2;

import brightone.pl.zadanie.newProject2.board.Board;
import brightone.pl.zadanie.newProject2.piece.Color;
import brightone.pl.zadanie.newProject2.piece.Piece;

import java.util.List;
import java.util.Objects;

public class Game {
    private Board board;
    private Player black;
    private Player white;
    private List<Piece> blackPieces;
    private List<Piece> whitePieces;

    public Game(Board board, List<Piece> blackPieces, List<Piece> whitePieces, Player black, Player white) {
        this.board = board;
        this.black = new Player(Color.Black);
        this.white = new Player(Color.White);
        this.blackPieces = this.black.getPieces();
        this.whitePieces = this.white.getPieces();
    }

    public Board getActualBoard() {
        return board;
    }

    public void setActualBoard(Board board) {
        this.board = board;
    }

    public Player getBlack() {
        return black;
    }

    public void setBlack(Player black) {
        this.black = black;
    }

    public Player getWhite() {
        return white;
    }

    public void setWhite(Player white) {
        this.white = white;
    }

    public List<Piece> getBlackPieces() {
        return blackPieces;
    }

    public void setBlackPieces(List<Piece> blackPieces) {
        this.blackPieces = blackPieces;
    }

    public List<Piece> getWhitePieces() {
        return whitePieces;
    }

    public void setWhitePieces(List<Piece> whitePieces) {
        this.whitePieces = whitePieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return Objects.equals(board, game.board) &&
                Objects.equals(getBlack(), game.getBlack()) &&
                Objects.equals(getWhite(), game.getWhite()) &&
                Objects.equals(getBlackPieces(), game.getBlackPieces()) &&
                Objects.equals(getWhitePieces(), game.getWhitePieces());
    }

    @Override
    public int hashCode() {
        return Objects.hash(board, getBlack(), getWhite(), getBlackPieces(), getWhitePieces());
    }
}