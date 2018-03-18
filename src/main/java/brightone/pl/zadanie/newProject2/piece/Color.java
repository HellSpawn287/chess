package brightone.pl.zadanie.newProject2;

public enum Color {
    White("b"),
    Black("c");

    private final String symbol;

    Color(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
