package brightone.pl.zadanie.newProject2.piece;

public enum Type {
    King("K", 0),
    Queen("H", 5),
    Rook("W", 4),
    Bishop("G", 3),
    Knight("S", 2),
    Pawn("P", 1),
    Empty("-", Integer.MIN_VALUE);

    private final String symbol;
    private final int value;

    Type(String symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
