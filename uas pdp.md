## 1. Jelaskan penggunaan array, looping, condition, dan class pada game yang dibuat !
## Array :
  - private static char[][] maze
      Pada script coding projek game saya, saya menggunakan Array dua dimensi yang dimana array ini di gunakan untuk sebuah labirin. Setiap karakter dalam array menentukan elemen labirin seperti dinding, karakter player, koin, harta karun, dan ular.

## looping :
  - for (char[] row : maze): Looping ini digunakan untuk setiap baris dalam array.
  - for (char cell : row): Looping ini digunakan untuk setiap elemen dalam satu baris array.

## condition :
  - if (isValidMove(newX, newY)): Kondisi untuk memeriksa apakah langkah yang dilakukan oleh pemain valid atau tidak.
  - if (newPosition == 'C'), else if (newPosition == 'T'), dan else if (newPosition == '£') : digunakan untuk menentukan aksi yang harus diambil berdasarkan posisi karakter pemain di labirin.
  - script ini termasuk pengkondisian untuk pergerakan atau perpindahan player, yang di simpen di dalam looping  do {  } while (program);

    switch (input) {
      case 'w':
        movePlayer(-1, 0); // Bergerak ke atas
      break;
      case 'a':
        movePlayer(0, -1); // Bergerak ke kiri
      break;
      case 's':
        movePlayer(1, 0); // Bergerak ke bawah
      break;
      case 'd':
        movePlayer(0, 1); // Bergerak ke kanan
      break;
      case 'q':
        if(treasures == 0){
          System.out.println("Keluar permainan.");
          program = false;
        else{
          System.out.println("Harta karun (T) Belum terkumpul semua !");
        }
        break;
        default:
          System.out.println("Perintah tidak valid!");
        break;
    
## class : 
  public class DiamondTreasuremerupakan deklarasi kelas yang berisi semua logika permainan, seperti metode untuk memindahkan player, memeriksa kevalidan langkah, dan menampilkan labirin.
  pada class DiamondTreasure ini juga memiliki beberapa variabel class yaitu :
    - private static int playerX;
    - private static int playerY;
    - private static int treasures = 0;
    - private static int totalTreasures = 6;
    - private static int energy = 250;
## method : 
  Pada script coding game saya juga menggunakan beberapa method, diantaranya : 
- private static void movePlayer(int moveX, int moveY): Method untuk memindahkan pemain berdasarkan langkah yang diinginkan.
- private static boolean isValidMove(int x, int y): Method untuk memeriksa kevalidan langkah.
- private static void setPlayerPosition(int x, int y): Method untuk mengatur posisi awal dan akhir karakter pemain.
- private static void printMaze(): Metode untuk menampilkan labirin ke layar.

## 2. Jelaskan proses pengembangan algoritma yang dilakukan pada game yang dibuat !

Karakter utama  / nama player : Ruby
Ruby adalah seorang pencari harta karun, dia harus mendapatkan koin terlebih dahulu untuk menuju ke pos, setiap koin yang di dapatkan Ruby juga akan menambah energi yang di miliki Ruby. Setelah Ruby berhasil mengumpulkan koin maka ruby bisa menuju ke pos pos, yang dimana di pos tersebut dia akan mendapatkan sebuah petunjuk dan Ruby harus mengikuti semua petunjuk yang bersumber dari catatan di pos tersebut agar berhasil mengumpulkan peti - peti harta karun. Namun, di tengah permainan Ruby juga harus melewati rintangan berupa ular, yang dimana jikalau Ruby terkena ular, energi yang di miliki Ruby akan berkurang. Dan keetika Ruby berjalan jalan secara terus menerus pun energi Ruby akan berkurang sedikit demi sedikit.

User Story / Game play :
  a). Ruby akan berjalan untuk mencari petunjuk 
  b).Ruby harus mengumpulkan koin terlebih dahulu untuk mendapatkan petunjuk dari pos
  c). Ruby harus mengumpulkan harta karun agar bisa keluar lewat pintu keluar
  d). Ruby harus melewati rintangan berupa ular
  e). Energi Ruby akan berkurang saat Ruby berjalan jalan dan akan berkurang lebih banyak saat terkena ular (gagal melewati rintangan)
  f). Energi Ruby akan bertambah saat mendapatkan koin
  g). Game akan berakhir jika energi Ruby sudah habis / Ruby berhasil mengumpulkan harta karun dan berhasil keluar.

## 3. Jelaskan bagaimana game yang dibuat dapat didistribusikan dan digunakan oleh pengguna !
cara game ini di sitribusikan agar bisa digunakan oleh pengguna yaitu bisa dengan cara di upload atau di broadcast di playstore.
