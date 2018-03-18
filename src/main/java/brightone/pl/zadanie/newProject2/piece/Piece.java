package brightone.pl.zadanie.newProject2;

public class Piece {
    private final Type type;
    private final Color color;


    public Piece(Type type, Color color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return type.toString() + color.toString();
    }
}
