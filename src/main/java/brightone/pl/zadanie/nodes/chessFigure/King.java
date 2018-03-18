/*
package brightone.pl.zadanie.nodes.chessFigure;

import brightone.pl.zadanie.nodes.Chessboard;

public class King extends ChessPiece {

    public King(String symbol, boolean available, String letter, int row) {
        super(piceID, symbol, available, letter, row);
    }

    @Override
    public boolean moveValidation(int fromRow, int toRow, String toLetter, String fromLetter) {
        boolean validation = false;
        for (String let : Chessboard.getLetters()) {
            validation = ((toRow != fromRow || (!toLetter.equals(fromLetter)))
                    && (toRow >= 0)
                    && (toRow <= 7)
                    && ((let.equals(toLetter)) || (let.equals(fromLetter))));
        }
        return validation;
    }
}
*/
