package brightone.pl.zadanie.newProject;

public class Figure {
    public int x;
    public int y;
    int figureID;
    boolean available;

    public Figure() {
    }

    public Figure(int figureID, int x, int y) {
        this.figureID = figureID;
        this.x = x;
        this.y = y;
        available = true;

    }

    boolean positionValidation(int figureID, int x, int y) {
        if (isAvailable(figureID)) {
            if (x >= 0 && x <= 7 && y >= 0 && y <= 7) return true;
        }
        return false;
    }

    boolean moveValidation(int playerID, this.x, this.y) {

        if (positionValidation(figureID, this.x, this.y)) {
            Spot[][] table = Board.getTable();
            if (playerID == 1) {
                if (table[this.x][this.y + 1].spotID == 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (playerID == 2) {
                if (table[this.x][this.y - 1].spotID == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    void move(int playerID, int figureID, this.x, this.y) {
        if (moveValidation(figureID, this.x, this.y)) {
            Spot[][] table = Board.getTable();
            if (playerID == 1) {
                this.y += 1;
                table[this.x][this.y - 1].spotID = 0;
                table[this.x][this.y].spotID = 1;
            } else if (playerID == 2) {
                this.y -= 1;
                table[this.x][this.y + 1].spotID = 0;
                table[this.x][this.y].spotID = 2;
            }
        }
    }

    boolean atackLeftValidation(Figure figure, int playerID) {
        if (figure.positionValidation(figure, figure.x, figure.y) == true) {
            Spot[][] table = Board.getTable();
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
            Spot[][] table = Board.getTable();
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

    int[] atack(Figure figure, Player player, int playerID) {
        int[] temp = new int[2];
        Spot[][] table = Board.getTable();
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
        }
        player.updateAllFigures(player, temp);
        return temp;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getFigureID() {
        return figureID;
    }

    public void setFigureID(int figureID) {
        this.figureID = figureID;
    }

    public boolean isAvailable(int figureID) {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
