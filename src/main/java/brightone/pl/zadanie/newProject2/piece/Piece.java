package brightone.pl.zadanie.newProject2.piece;

public abstract class Piece {
    private final Type type;
    private final Color color;
    private int x;
    private int y;

    Piece(Type type, Color color, int x, int y) {
        this.type = type;
        this.color = color;
        checkingLocalisation(x, y);
    }

    Piece() {
        this.type = Type.Empty;
        this.color = Color.None;
    }

    private void checkingLocalisation(int x, int y) {
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            this.x = x;
            this.y = y;
        } else throw new IllegalArgumentException("Wrong piece localisation (x = " + x + "y=" + y +
                ". Localisation range should be from 0, to 7. Please provide correct one");
    }

    public void move(int toX, int toY) {
        checkingLocalisation(toX, toY);
    }

    @Override
    public String toString() {
        return type.toString() + color.toString();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Type getType() {
        return type;
    }
}
