/*
package brightone.pl.zadanie.nodes;

import brightone.pl.zadanie.nodes.chessFigure.*;

import java.util.ArrayList;
import java.util.List;

public class Player {
    static final int numberOfPawns = 8;
    final int numberOfBishops = 2;
    final int numberOfRooks= 2;
    public static boolean gotBlack;

    public Player(boolean gotBlack) {
        this.gotBlack = gotBlack;
    }

    private static List<ChessPiece> pieces = new ArrayList<>();


    public List<ChessPiece> getPieces() {
        return pieces;
    }
    public Spot1[][] pieces2 = new Spot1[8][8];

    public static String[][] initialSizeOfPiecesArmy(){
        Chessboard chessboard= new Chessboard();
        if (gotBlack ==true){
            for (int i = 0; i <numberOfPawns; i++) {
                pieces.add(new Pawn("Pc", true, Pawn.getLetter(i), 1));
            }
                pieces2[0][0]= new Spot1();        // (new Rook("Wc", true, Rook.getLetter(0), 0));

            pieces.add(new Rook("Wc", true, Rook.getLetter(0), 0));
            pieces.add(new Rook("Wc", true, Rook.getLetter(7), 0));
            pieces.add(new Bishop("Gc", true, Bishop.getLetter(2), 0));
            pieces.add(new Bishop("Gc", true, Bishop.getLetter(2), 0));
            pieces.add(new Knight("Sc",true, Knight.getLetter(1), 0));
            pieces.add(new Knight("Sc",true, Knight.getLetter(6), 0));
            pieces.add(new King("Hc", true, King.getLetter(4), 0));
            pieces.add(new Queen("Kc", true, Queen.getLetter(3),0));
        }
        else {
            for (int i = 0; i <numberOfPawns; i++) {
                pieces.add(new Pawn("Pw", true, Pawn.getLetter(i), 6));
            }
            pieces.add(new Rook("Wb", true, Rook.getLetter(0), 7));
            pieces.add(new Rook("Wb", true, Rook.getLetter(7), 7));
            pieces.add(new Bishop("Gb", true, Bishop.getLetter(2), 7));
            pieces.add(new Bishop("Gb", true, Bishop.getLetter(2), 7));
            pieces.add(new Knight("Sb",true, Knight.getLetter(1), 7));
            pieces.add(new Knight("Sb",true, Knight.getLetter(6), 7));
            pieces.add(new King  ("Hb", true, King.getLetter(4), 7));
            pieces.add(new Queen ("Kb", true, Queen.getLetter(3),7));
        } return chessboard.getChessBoard();
    }
}
*/
