/*
package brightone.pl.zadanie.newProject;

public class Board {
    private static Spot[][] table = new Spot[8][8];


    public Board() {
        this.table = table;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                table[j][i] = new Spot();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                table[j][i].spotID = 1;
            }
        }
        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                table[j][i].spotID = 2;
            }
        }

    }

    public static Spot[][] getTable() {
        return table;
    }

    public void printTable() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(table[j][i].spotID + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    boolean moveValidation(Figure figure, int playerID) {
        if (figure.positionValidation(figure, figure.x, figure.y) == true) {
            if (playerID == 1) {
                if (table[figure.x][figure.y + 1].spotID == 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (playerID == 2) {
                if (table[figure.x][figure.y - 1].spotID == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    void move(Figure figure, int playerID, int x, int y) {
        if (moveValidation(figure, playerID)) {
            if (playerID == 1) {
                figure.y += 1;
                table[figure.x][figure.y - 1].spotID = 0;
                table[figure.x][figure.y].spotID = 1;
            } else if (playerID == 2) {
                figure.y -= 1;
                table[figure.x][figure.y + 1].spotID = 0;
                table[figure.x][figure.y].spotID = 2;
            }
        }
    }

    boolean atackLeftValidation(Figure figure, int playerID) {
        if (figure.positionValidation(figure, figure.x, figure.y) == true) {
            if (playerID == 1) {
                if (table[figure.x - 1][figure.y + 1].spotID == 2) {
                    return true;
                } else
                    return false;
            } else if (playerID == 2) {
                if (table[figure.x + 1][figure.y - 1].spotID == 2) {
                    return true;
                } else
                    return false;
            }
        }
        return false;
    }

    boolean atackRightValidation(Figure figure, int playerID) {
            if (figure.positionValidation(figure, figure.x, figure.y) == true) {
                if (playerID == 1) {
                    if (table[figure.x + 1][figure.y + 1].spotID == 2) {
                        return true;
                    } else
                        return false;
                } else if (playerID == 2) {
                    if (table[figure.x - 1][figure.y - 1].spotID == 1) {
                        return true;
                    } else
                        return false;
                }
            }
        return false;
    }

    int[] atack(Figure figure, Player player , int playerID) {
        int[] temp = new int[2];
        if (playerID == 1) {
            if (atackLeftValidation(figure, playerID) == true) {
                table[figure.x][figure.y].spotID = 0;
                figure.x = figure.x - 1;
                figure.y = figure.y + 1;
                table[figure.x][figure.y].spotID = 1;
            } else if (atackRightValidation(figure, playerID) == true) {
                table[figure.x][figure.y].spotID = 0;
                figure.x = figure.x + 1;
                figure.y = figure.y + 1;
                table[figure.x][figure.y].spotID = 1;

            }
            temp[0] = figure.x;
            temp[1] = figure.y;
        } else if (playerID == 2) {
            if (atackLeftValidation(figure, playerID) == true) {
                table[figure.x][figure.y].spotID = 0;
                figure.x = figure.x - 1;
                figure.y = figure.y + 1;
                table[figure.x][figure.y].spotID = 2;
            } else if (atackRightValidation(figure, playerID) == true) {
                table[figure.x][figure.y].spotID = 0;
                figure.x = figure.x + 1;
                figure.y = figure.y + 1;
                table[figure.x][figure.y].spotID = 2;
            }
            temp[0] = figure.x;
            temp[1] = figure.y;
        }player.updateAllFigures(player, temp);
        return temp;
    }
}
*/
