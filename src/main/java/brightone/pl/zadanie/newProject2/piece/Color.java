package brightone.pl.zadanie.newProject2.piece;

public enum Color {
    White("b"),
    Black("c"),
    None("+-");

    private final String symbolColor;

    Color(String symbolColor) {
        this.symbolColor = symbolColor;
    }

    public String getSymbolColor() {
        return symbolColor;
    }

    @Override
    public String toString() {
        return symbolColor;
    }
}
