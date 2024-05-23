package org.example;

public class Board {
    public char[][] cells;

    public Board() {
        cells = new char[3][3];
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++) {
                cells[i][j] = ' ';
            }
        }
    }

    public char isCellEmpty(int x, int y) {
        return cells[x][y] = ' ';
    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y) == ' ') {
            cells[x][y] = marker;
        }
    }
}
