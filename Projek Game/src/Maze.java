class Maze {
    private char[][] mazeData;

    // Tambahkan variabel untuk menyimpan posisi pemain
    private int playerX;
    private int playerY;

    public Maze(char[][] mazeData, int playerX, int playerY) {
        this.mazeData = mazeData;
        this.playerX = playerX;
        this.playerY = playerY;
    }

    
    public void printMaze() {
        for (int i = 0; i < mazeData.length; i++) {
            for (int j = 0; j < mazeData[i].length; j++) {
                // Ganti 'M' dengan posisi pemain
                if (i == playerX && j == playerY) {
                    System.out.print(' ' + " ");
                } else {
                    System.out.print(mazeData[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public char getCell(int x, int y) {
        return mazeData[x][y];
    }

    public void setCell(int x, int y, char value) {
        mazeData[x][y] = value;
    }

     // Agar karakter tidak bisa melewati batas labirin
    public boolean isValidMove(int x, int y) {
        return x >= 0 && x < mazeData.length && y >= 0 && y < mazeData[0].length && mazeData[x][y] != '#';
    }

    // Tambahkan metode untuk mengatur posisi pemain
    public void setPlayerPosition(int x, int y) {
        this.playerX = x;
        this.playerY = y;
    }
}
