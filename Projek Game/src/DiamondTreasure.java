import java.util.Scanner;

public class DiamondTreasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] mazeData = {
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '£', 'C', '#', ' ', ' ', ' ', '#', '#'},
        {'#', ' ', '#', ' ', '£', '#', '#', ' ', '#', '#', ' ', ' ', '#', ' ', 'T', ' ', '#', '#'},
        {'#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', '£', '#', ' ', 'C', ' ', '#', '#'},
        {'#', ' ', '#', '#', ' ', '#', ' ', 'C', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', '#', '#'},
        {'#', ' ', ' ', ' ', ' ', '#', ' ', 'T', ' ', '#', '#', ' ', '#', ' ', '#', '#', '#', '#'},
        {'#', ' ', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#', ' ', '#'},
        {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#'},
        {'#', ' ', '#', 'C', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#'},
        {'#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', '#', ' ', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#'},
        {'#', ' ', '#', '#', '#', ' ', '#', 'T', ' ', ' ', '#', ' ', ' ', '#', '#', '#', ' ', '#'},
        {'#', ' ', '#', '#', '#', ' ', '#', ' ', 'C', ' ', '#', ' ', '#', '#', ' ', ' ', ' ', '#'},
        {'#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', '#'},
        {'#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#'},
        {'#', '#', ' ', '#', ' ', ' ', ' ', '£', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', '#'},
        {'#', ' ', ' ', ' ', ' ', '£', ' ', ' ', ' ', '£', '#', ' ', '#', '#', ' ', '#', '£', '#'},
        {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '£', ' ', '#', '#', '#'},
        {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', ' ', ' ', '#', '#'},
        {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#', '#'},
        {'#', ' ', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', '#'},
        {'#', ' ', '#', '#', ' ', '#', '#', 'C', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', '#'},
        {'#', ' ', '#', '#', ' ', '#', '#', '#', ' ', '#', '#', '#', '#', ' ', '#', ' ', '#', '#'},
        {'#', 'C', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#', '#'},
        {'#', '#', '#', '#', ' ', '#', ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', ' ', '#', '#'},
        {'#', '#', ' ', ' ', ' ', '#', ' ', '£', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#'},
        {'#', '#', ' ', '#', '#', '#', ' ', ' ', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', ' ', '#', '#', '#', '£', 'T', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', '£', ' ', 'T', '#'},
        {'#', '#', ' ', ' ', ' ', '£', ' ', ' ', ' ', ' ', ' ', ' ', '£', ' ', ' ', ' ', 'C', '#'},
        {'#', '#', ' ', '£', ' ', ' ', ' ', '£', 'C', ' ', '£', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},

    };

        // Inisialisasi posisi awal pemain
        int playerX = 1;
        int playerY = 1;

        Maze maze = new Maze(mazeData, playerX, playerY);
        Player player = new Player(playerX, playerY, 250, 5);

         // Memulai permainan dan loop utama
        boolean program = true;
        char input;

        do {
            maze.printMaze();

            System.out.println("Energi: " + player.getEnergy());
            System.out.println("Total treasure : " + player.getTreasures());
            System.out.print("Masukkan perintah (w/a/s/d untuk gerak, q untuk keluar): ");
            input = scanner.next().charAt(0);

            switch (input) {
                case 'w':
                    player.move(-1, 0, maze);
                    break;
                case 'a':
                    player.move(0, -1, maze);
                    break;
                case 's':
                    player.move(1, 0, maze);
                    break;
                case 'd':
                    player.move(0, 1, maze);
                    break;
                case 'q':
                    if (player.getTreasures() == player.gettotalTreasures()) {
                        System.out.println("Keluar permainan.");
                        program = false;
                    } else {
                        System.out.println("Harta karun (T) belum terkumpul, anda tidak bisa keluar permainan!");
                    }
                    break;
                default:
                    System.out.println("Perintah tidak valid!");
                    break;
            }

            // Cek apakah semua harta karun telah terkumpul
            if (player.getTreasures() == player.gettotalTreasures()) {
                System.out.println("Selamat kamu menang dan berhasil keluar!");
                System.out.println("Ingin bermain lagi? (y/n)");
                char playAgain = scanner.next().charAt(0);
                if (playAgain == 'n') {
                    program = false; // Keluar dari loop utama jika tidak ingin bermain lagi
                } else {
                    // Atur ulang posisi pemain dan energi
                    player = new Player(playerX, playerY, 250, 5);
                    maze.setPlayerPosition(playerX, playerY);
                }
            }

        } while (program);

        scanner.close();
    }
}
