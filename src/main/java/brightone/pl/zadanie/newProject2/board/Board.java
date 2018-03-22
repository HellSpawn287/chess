package brightone.pl.zadanie.newProject2.board;

public class Board {
    private Spot[][] table;

    public Board(Spot[][] table) {
        this.table = table;
        for (int x = 0; x <8 ; x++) {
            for (int y = 0; y <8 ; y++) {
                table[x][y]= new Spot();
            }
        }
    }

    public void printTable(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(table[x][y].getContent() + "  ");
            }System.out.println("");
        }System.out.println("");
    }

    public static void main(String[] args) {
        Board board = new Board(new Spot[8][8]);


        board.printTable();
    }


}
