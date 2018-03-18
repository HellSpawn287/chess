package brightone.pl.zadanie.newProject;

public class Player {
    public Figure[] allFigures = new Figure[16];
    int playerID;

    public Player(int playerID) {
        this.playerID = playerID;
        switch (playerID) {
            case 1: {
                for (int i = 0; i < 8; i++) {
                    allFigures[i] = new Figure(i, 0);
                }
                for (int i = 8; i < 16; i++) {
                    allFigures[i] = new Figure(i - 8, 1);
                }
            }
            break;
            case 2: {
                for (int i = 0; i < 8; i++) {
                    allFigures[i] = new Figure(i, 6);
                }
                for (int i = 8; i < 16; i++) {
                    allFigures[i] = new Figure(i - 8, 7);
                }
            }
            break;
            default: break;
        }
    }

     void updateAllFigures(Player player, int[] atackCoordinates){
        for (int i = 0; i <16 ; i++) {
            if (player.allFigures[i].x ==atackCoordinates[0] && player.allFigures[i].y ==atackCoordinates[1]){
                player.allFigures[i].setAvailable(false);
            }
        }
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public Figure[] getAllFigures() {
        return allFigures;
    }

    public void setAllFigures(Figure[] allFigures) {
        this.allFigures = allFigures;
    }
}
