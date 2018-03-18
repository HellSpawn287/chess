package brightone.pl.zadanie.newProject;

public class Node2 {
    public static void main(String[] args) {
        Board board = new Board();
        Figure figure = new Figure();
        Player black = new Player(2);
        Player white = new Player(1);
        int[] coordinates = new int[2];

        board.printTable();
        figure.move(1, white.allFigures[10].x, white.allFigures[10].y);
        figure.move(1, white.allFigures[10].x, white.allFigures[10].y);
        figure.move(1, white.allFigures[10].x, white.allFigures[10].y);
        figure.move(1, white.allFigures[10].x, white.allFigures[10].y);

        //figure.move(white.allFigures[10], 1, white.allFigures[10].x, white.allFigures[10].y);
        board.printTable();
        figure.atack(Board.getTable(), black,1);
        board.printTable();

        for (int i = 0; i <16 ; i++) {
            if (black.allFigures[i].isAvailable()==false){
                System.out.println(i + "t ");
            } else System.out.println( i + "f ");

        }

    }
}
