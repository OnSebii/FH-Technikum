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

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] ==' ';
    }

    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)){
            cells[x][y] = marker;
        }
    }
    public void print() {
        for (int i = 0; i<=2;i++){
            System.out.print((cells[i][0] == '\u0000') ? ' ' : cells[i][0] +"|");
            System.out.print((cells[i][1] == '\u0000') ? ' ' : cells[i][1] +"|");
            System.out.println((cells[i][2] == '\u0000') ? ' ' : cells[i][2]);
            if(i<2) {
                System.out.println("------");
            }
        }
    }

}
