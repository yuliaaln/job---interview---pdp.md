class Player {
    private int x;
    private int y;
    private int energy;
    private int treasures; // Jumlah harta karun yang telah dikumpulkan
    private int totalTreasures;// Total harta karun yang harus dikumpulkan

    public Player(int x, int y, int energy, int totalTreasures) {
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.totalTreasures = totalTreasures;
        this.treasures = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getEnergy() {
        return energy;
    }

    public int gettotalTreasures() {
        return totalTreasures;
    }

    public int getTreasures() {
        return treasures;
    }

     // method untuk memindahkan pemain
    public void move(int moveX, int moveY, Maze maze) {
        int newX = x + moveX;
        int newY = y + moveY;
        

        if (maze.isValidMove(newX, newY)) {
            char newPosition = maze.getCell(newX, newY);

              // Karakter mengambil koin dan energi bertambah
            if (newPosition == 'C') {
                maze.setCell(newX, newY, ' ');
                energy += 8;
                System.out.println("Anda mendapatkan koin! Energi +8");
            }
            // Karakter mengambil dan mengumpulkan harta karun
            else if (newPosition == 'T') {
                treasures++;
                System.out.println("Anda telah mengumpulkan harta karun sebanyak : " + treasures);

                if (treasures == totalTreasures) {
                    System.out.println("Selamat kamu menang dan berhasil keluar!");
                    System.exit(0);
                }
            }
            // Energi berkurang jika karakter menginjak ular
            else if (newPosition == '£') {
                energy -= 5;
                System.out.println("Anda terkena ular! Energi -5");
            }

            // Hapus dan update posisi karakter
            maze.setCell(x, y, ' ');
            x = newX;
            y = newY;
            maze.setCell(x, y, 'M');
            
            energy--;// Setiap gerakan mengurangi energi

            if (energy <= 0) {
                System.out.println("Energi habis. Permainan berakhir.");
                System.exit(0);
            }
        } else {
            System.out.println("Tidak bisa bergerak ke sana!");
        }
    }
}