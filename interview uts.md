## 1.1 Latar Belakang

Latar belakang saya  membuat game ini yaitu sebagai wadah untuk menyalurkan pengetahuan dan keterampilan yang telah saya pelajari semasa pembelajaran, selama masa pengembangan game ini saya mempelajari banyak hal seperti, mendesain konsep game, tampilan game, alur game, dll. serta mempelajari juga bagaimana cara menerapkan kode dalam bahasa pemrograman sehingga menghasilkan sebuah fitur dalam game. Projek ini merupakan kesempatan yang berharga bagi saya sebagai tempat untuk menggabungkan pengetahuan dan keterampilan kedalam sebuah hasil projek berupa game. Alasan saya membuat konsep game seperti ini, karena saya terinspirasi dari game yang pernah mainkan sejak kecil yaitu game Diamond Rush.

## 1.2. Deksripsi Teknologi Informasi

Ruby adalah seorang pencari harta karun, dia harus mendapatkan koin terlebih dahulu untuk menuju ke pos, setiap koin yang di dapatkan Ruby akan menambah energi yang dimiliki Ruby. Setelah Ruby berhasil mengumpulkan koin maka ruby bisa menuju ke pos pos, yang dimana di pos tersebut dia harus menjawab sebuah pertanyaan, jika Ruby berhasil menjawab pertanyaan maka Ruby akan mendapatkan sebuah petunjuk dan Ruby harus mengikuti semua petunjuk yang bersumber dari catatan di pos tersebut agar dapat berhasil mengumpulkan peti - peti harta karun. Namun, di tengah permainan Ruby juga harus melewati rintangan berupa ular, yang dimana jikalau Ruby terkena ular, energi yang di miliki Ruby akan berkurang 10. Dan ketika Ruby berjalan 1 langkah maka energi Ruby akan berkurang 1.

## 1.3. Branding

1.3.1 Nama / Merk Game:
      Diamond Treasure Hunter 

1.3.2 Deskripsi Target :
      - Anak anak usia 8 tahun ke atas
      - Orang yang senang bermain game
      - Orang yang menyukai tantangan

1.3.3 Genre :
      Edukasi
      
## 2. User Story

Sebagai | Saya ingin bisa | Sehingga | Prioritas
---|---|---|---
Player | Berjalan kemana mana |Bisa mengambil koin dan mencari petunjuk|⭐⭐⭐⭐⭐
Player | Mengambil koin |Menambah energi player dan mendapat petunjuk| ⭐⭐⭐⭐⭐
Player | Melewati rintangan |Melanjutkan permainan dan mencari harta karun|⭐⭐⭐⭐⭐
Player | Mengumpulkan harta karun |Berhasil keluar permainan dan menang|⭐⭐⭐⭐

## 3. Struktur Data
![struktur data game](https://github.com/yuliaaln/uts-uas-pdp.md/assets/144923542/b01e7107-6c10-44a7-b607-7dcee11084b5)

## 4. Teknologi, Library, dan Framework

- UI/UX Design : Figma
- Text Editor : VS Code


## 5. Desain User Experience dan User Interface
![Layout dashboard](https://github.com/yuliaaln/job---interview---pdp.md/assets/144923542/1b1af946-1851-4801-8616-2bdef50d5604)

![Layout masuk permainan](https://github.com/yuliaaln/job---interview---pdp.md/assets/144923542/d44aaad2-c7b1-4b6e-ac76-f2ce78cfe07d)

![Screenshot 2023-11-08 13 33 05](https://github.com/yuliaaln/job---interview---pdp.md/assets/144923542/0b52dace-da42-430f-aa11-6240a468b80c)


## 6. Flowchart 
![perancangan game-flowchart drawio](https://github.com/yuliaaln/job---interview---pdp.md/assets/144923542/5bf59d6f-dbc3-4f2e-b2e4-caf761e24c27)


## 7. Prinsip - prinsip yang diterapkan dalam game
- Variable
- Data Type
- Operator
- Boolean
- onditions: if / else / switch
- Looping: while / for
- Array
- Method
- Class

## 8. Link demo di youtube

[in progres]

## 9. Link folder kode pemograman
Link : https://drive.google.com/drive/folders/1Ko1k2nd8g8ah7y4lFkJ9P6ivia3lIOuT?usp=drive_link 

## 10. Bagaimana konsep variable, data type dan operator pada bahasa pemrograman digunakan dalam pembuatan game ini ?
Pada script code game ini, terdapat konsep-konsep dasar dalam pemrograman, seperti variable, data type, dan operator. konsep tersebut digunakan untuk mengatur dan mengontrol jalannya permainan. Berikut adalah penjelasan dari penggunaan konsep-konsep tersebut dalam game
1. Variable:
   - maze: Variabel array dua dimensi yang menyimpan representasi labirin permainan.
   - playerX dan playerY: Variabel untuk menyimpan koordinat pemain dalam labirin.
   - treasures: Variabel untuk menyimpan jumlah harta karun yang telah dikumpulkan.
   - totalTreasures: Variabel untuk menyimpan total harta karun yang harus dikumpulkan.
   - energy: Variabel untuk menyimpan nilai energi pemain.
     
2. Data Type:
   - char: Tipe data karakter digunakan untuk menyimpan elemen-elemen dalam labirin.
   - int: Tipe data integer digunakan untuk menyimpan nilai bilangan bulat, seperti jumlah harta karun dan energi.
     
3. Operator:
   - Operator penugasan (=): Digunakan untuk memberikan nilai pada variabel, seperti playerX = x;.
   - Operator perbandingan (==, <=, <, >=, >): Digunakan untuk membandingkan nilai, misalnya pada kondisi if (treasures == totalTreasures - 1).
   - Operator aritmatika (+=, -=): Digunakan untuk operasi penambahan dan pengurangan, seperti dalam mendapatkan koin (energy += 8;) dan terkena ular (energy -= 5;).
            - Operator logika (&&, ||): Digunakan untuk operasi logika, seperti pada method isValidMove.
            - Operator pemanggilan metode atau fungsi (.): Digunakan untuk memanggil metode atau fungsi dari suatu objek, contohnya scanner.next().

## 11. Bagaimana konsep boolean dan conditions pada bahasa pemrograman digunakan dalam pembuatan game ini ? 
Dalam game ini, konsep boolean dan kondisi (conditions) digunakan untuk mengatur alur permainan dan mengambil keputusan berdasarkan situasi tertentu. Berikut adalah beberapa contoh penggunaan konsep boolean dan kondisi dalam game ini:

1. Variabel Boolean:
   - program: Variabel boolean digunakan untuk mengontrol loop utama permainan. Jika program adalah true, maka permainan akan terus berlanjut.
   
2. Conditions (Kondisi):
   Pada blok if dalam metode movePlayer: 
   - if (newPosition == 'C'): Kondisi ini menguji apakah karakter bergerak ke posisi yang berisi koin ('C'). Jika benar, karakter mengambil koin, energi bertambah, dan pesan ditampilkan.
   - else if (newPosition == 'T'): Kondisi ini memeriksa apakah karakter bergerak ke posisi yang berisi harta karun ('T'). Jika benar dan semua harta karun telah dikumpulkan, permainan selesai. Jika belum, pesan ditampilkan.
   - else if (newPosition == '£'): Kondisi ini memeriksa apakah karakter bergerak ke posisi yang berisi ular ('£'). Jika benar, energi berkurang dan pesan ditampilkan.
   - else: Kondisi default yang berlaku jika tidak ada kondisi di atas yang terpenuhi. Posisi lama karakter dihapus dari labirin, posisi baru diupdate, dan energi dikurangkan.

      Kondisi di atas digunakan untuk mengendalikan jalannya permainan, memberikan feedback kepada pemain, dan menentukan kapan permainan harus dihentikan. Konsep boolean dan kondisi ini sangat penting dalam logika alur permainan untuk membuatnya interaktif dan menarik.
      
## 12. Bagaimana konsep looping dan array pada bahasa pemrograman digunakan dalam pembuatan game ini ?
Dalam game ini, konsep looping dan array digunakan untuk mengatur dan merepresentasikan struktur labirin serta melakukan iterasi (perulangan) untuk menampilkan dan mengupdate posisi karakter manusia. Berikut contoh penggunaan konsep looping dan array dalam game ini:

1. Looping :
   - for (char[] row : maze): Digunakan untuk iterasi melalui setiap baris dalam labirin.
   - for (char[] row : maze) {
           for (char cell : row) {
                 System.out.print(cell + " ");
           }
                 System.out.println();
           }
     Ini digunakan dalam method printMaze untuk menampilkan labirin ke layar.
   - do-while loop: Loop ini digunakan sebagai loop utama permainan. Permainan akan terus berlanjut selama variabel program bernilai true.
   - switch-case statement: Digunakan untuk menanggapi input dari pemain dan memanggil metode movePlayer sesuai dengan arah gerakan yang dipilih.

2. Array:
   - private static char[][] maze: Digunakan sebagai array dua dimensi untuk merepresentasikan labirin. Setiap elemen array menyimpan karakter yang mewakili bagian dari labirin (dinding, karakter pemain, koin, ular, dan harta karun).
   - maze[playerX][playerY]: Menunjukkan posisi saat ini karakter manusia dalam labirin.
   - Labirin diinisialisasi dengan karakter '#' untuk dinding, ' ' untuk celah kosong, 'M' untuk posisi karakter manusia, 'C' untuk koin, 'T' untuk harta karun, dan '£' untuk ular.

Melalui penggunaan array dan perulangan, game ini dapat dengan efisien merepresentasikan labirin dan mengatur alur permainan. Looping digunakan untuk menampilkan labirin dan menjalankan permainan, sementara array menyimpan informasi penting tentang struktur labirin dan posisi karakter. 
   
## 13. Bagaimana konsep method pada bahasa pemrograman digunakan dalam pembuatan game ini ?
Dalam game ini, konsep method digunakan untuk memisahkan tugas-tugas tertentu ke dalam blok-blok kode yang dapat dipanggil saat diperlukan. Pemisahan tugas ini mempermudah pembacaan kode, mengurangi redundansi, dan memungkinkan pengelolaan kode yang lebih baik. Berikut adalah penjelasan penggunaan method dalam game ini:

1. **Method: `movePlayer(int moveX, int moveY)`**
   - Method ini digunakan untuk memindahkan pemain ke posisi baru sesuai dengan pergerakan yang diinginkan.
   - Parameter `moveX` dan `moveY` menentukan perubahan koordinat pemain.
   - Method melakukan berbagai tugas, termasuk:
     - Memeriksa kevalidan pergerakan.
     - Menangani aksi saat pemain mengambil koin.
     - Menangani aksi saat pemain mengambil harta karun.
     - Menangani aksi saat pemain terkena ular.
     - Memperbarui posisi pemain dalam array labirin.
     - Mengurangi energi pemain dan menangani akhir permainan jika energi habis.

2. **Method:`isValidMove(int x, int y)`**
   - Method ini digunakan untuk memeriksa apakah pergerakan ke posisi `(x, y)` valid atau tidak.
   - Memeriksa apakah posisi `(x, y)` berada di dalam labirin dan tidak bertabrakan dengan dinding ('#').

3. **Method:`setPlayerPosition(int x, int y)`**
   - Method ini digunakan untuk mengatur posisi awal karakter manusia di labirin.
   - Digunakan saat inisialisasi permainan untuk menempatkan karakter pemain pada posisi awal.

4. **Method: `printMaze()`**
   - Method ini digunakan untuk menampilkan labirin ke layar.
   - Mencetak setiap elemen array dalam labirin ke layar sehingga pemain dapat melihat tampilan aktual dari labirin.

5. **Method: `main(String[] args)`**
   - Method `main` merupakan entry point dari program.
   - Menggunakan method-method di atas untuk mengorganisir alur utama permainan.
   - Menerima input dari pemain dan memanggil method `movePlayer` untuk melakukan pergerakan sesuai dengan input.

Pemisahan tugas-tugas ini membuat kode lebih terstruktur, mudah dimengerti, dan dapat diubah dengan lebih mudah. Selain itu, method-method ini dapat digunakan kembali atau dimodifikasi tanpa mempengaruhi bagian-bagian lain dari program.

## 14. Bagaimana konsep class pada bahasa pemrograman digunakan dalam pembuatan game ini ?
Dalam pembuatan game ini, konsep class pada bahasa pemrograman Java digunakan untuk mengorganisir kode ke dalam sebuah kelas yang mencerminkan entitas game, yaitu `DiamondTreasure`. Berikut adalah cara konsep class digunakan dalam game ini:

1. **Encapsulation:**
   - Semua variabel yang berkaitan dengan game, seperti `maze`, `playerX`, `playerY`, `treasures`, `totalTreasures`, dan `energy`, dideklarasikan sebagai variabel privat. Ini menerapkan konsep encapsulation, di mana detail implementasi dari kelas tidak terlihat dari luar dan hanya dapat diakses melalui metode-metode publik.

2. **Static Keyword:**
   - Beberapa variabel dan metode di-declare sebagai `static`. Variabel `maze`, `playerX`, `playerY`, `treasures`, `totalTreasures`, dan `energy` di-declare sebagai `static`, sehingga dapat diakses tanpa harus membuat objek dari kelas `DiamondTreasure`. Ini memudahkan penggunaan variabel dan metode dari metode-metode static seperti `main`.

3. **Method:**
   - Semua tindakan yang dapat dilakukan oleh objek game, seperti `movePlayer`, `isValidMove`, `setPlayerPosition`, dan `printMaze`, diimplementasikan sebagai metode-metode dalam kelas `DiamondTreasure`. Ini memisahkan tugas-tugas tertentu ke dalam blok-blok kode yang dapat dipanggil saat diperlukan.

4. **Main Method:**
   - Method `main` adalah entry point dari program dan merupakan tempat eksekusi utama game. Dalam metode ini, objek dari kelas `Scanner` dibuat untuk menerima input dari pengguna. Selain itu, metode-metode dari kelas `DiamondTreasure` dipanggil untuk mengatur inisialisasi permainan dan menjalankan loop utama permainan.

5. **Object-Oriented Design:**
   - Seluruh program dirancang dengan pendekatan berorientasi objek, di mana kelas `DiamondTreasure` merepresentasikan entitas utama dari game ini. Variabel-variabel dan metode-metode yang berkaitan dengan game ditempatkan di dalam kelas ini.

Dengan menggunakan konsep class, game ini menjadi lebih terstruktur, modular, dan memudahkan pemeliharaan serta pengembangan kode di masa depan. Setiap elemen game dikelola dalam satu entitas (kelas) yang menyederhanakan kompleksitas program.

## 15. Jelaskan algoritma buatan sendiri yang digunakan pada pembuatan game ini !
1. **Tampilan awal game**
   - Tampilkan start, setting, exit
     
     a. Menu Start
           Pada menu start terdapat pemilihan level / tingkat kesulitan pada game, yaitu ada level :
           - Easy
           - Medium
           - Hard
     
     b. Menu Setting
           Saat pengguna ingin bermain game, pertama pengguna bisa memilih menu setting dan akan di arahkan pada menu pemilihan karakter untuk memilih karakter terlebih dahulu.

     c. Menu Exit
           Keluar dari game
     
2. **Mulai Permainan**
   Ketika tombol "Start" ditekan:
    
     a. Pemilihan level
     b. Permainan di mulai dengan tingkt level yang di pilih.
   
3. **Arena Game**
   Selama permainan berlangsung:
   - Player dapat berjalan untuk mencari petunjuk
   - Player dapat mengumpulkan koin untuk menambah energi dan mendapatkan petunjuk dari pos
   - Player harus mengumpulkan harta karun sesuai perintah untuk bisa memenangkan permainan
   - Player harus melewati rintangan berupa ular
   - Energi yang di miliki player akan berkurang 1 setiap pindah posisi 1x dan akan berkurang 10 jika menginjak ular
   - Game akan berakhir kalah jika energi player sudah habis / dan akan mennag jika player berhasil mengumpulkan harta karun

