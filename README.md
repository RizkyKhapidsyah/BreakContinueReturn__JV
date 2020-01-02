# BreakContinueReturn__JV

Bahan Ajar Fundamental Pemrograman Java. Mengenal Penggunaan Keyword Break, Continue dan Return Pada Pemrograman Java.<br><br>
<img src="https://github.com/RizkyKhapidsyah/BreakContinueReturn__JV/blob/master/result/001.PNG"></a><br><br>
- Lihat <a href="https://github.com/RizkyKhapidsyah/BreakContinueReturn__JV/blob/master/src/com/rizkykhapidsyah/controlflow/Main.java">Source Code.</a><br><br>

Dalam Java, kata kunci  Break dan Continue adalah struktur kontrol yang pada umumnya digunakan dalam sebuah perulangan seperti while, do-while dan for loops atau statement lainnya seperti switch-case, kedua keyword tersebut digunakan dalam sebuah statement untuk menghentikan dan melanjutkan pernyataan didalam statement pada kondisi tertentu

# Cara Menggunakan Perintah Break dan Continue pada Java

## Kata Kunci Break

Break pada umumnya digunakan dalam java untuk mengakhiri sebuah eksekusi dalam statement, dengan menggunakan kata kunci Break, pernyataan didalam statement akan langsung berhenti, jadi kita harus membuat sebuah kondisi. kapan program akan berhenti. for loops digunakan saat diamana kita ingin melakukan hal yang khusus seperti jika nilainya mencapai angka tertentu atau lebih dari angka tertentu maka kita akan menghentikan program tersebut.

Contohnya seperti pada program berikut ini:

      public class break_continue {
          public static void main(String[] args){
              for(int w=0; w<7; w++){
                  if(w == 5){
                      break;
                  }else{
                  System.out.println(w);
                  }
              }
          }
      }

Dimana saat nilai pada variable w mencapai angka 5, maka program akan berhenti total dan pernyataan dialam for loops tidak akan di eksekusi kembali. Selain pada statement perulangan, pada umumnya saat kita menggunakan statement switch-case, pernyataan didalam case perlu kita tambahkan atau akhiri dengan Break,

Seperti pada contoh berikut ini:

      public class break_continue {
          public static void main(String[] args){
              int Makanan = 2;
              switch(Makanan){
                  case 1:
                      System.out.println("Ayam Goreng");
                      break;
                  case 2:
                      System.out.println("Mie Rebus");
                      break;
                  case 3:
                      System.out.println("Bakso");
                      break;
                  default:
                      System.out.println("Menu Tidak Ditemukan");
              }
          }
      }

Jika kita hilangkan kata kunci switch pada case tersebut, maka menjadi seperti ini:

      public class break_continue {
          public static void main(String[] args){
              int Makanan = 2;
              switch(Makanan){
                  case 1:
                      System.out.println("Ayam Goreng");
                  case 2:
                      System.out.println("Mie Rebus");
                  case 3:
                      System.out.println("Bakso");
                  default:
                      System.out.println("Menu Tidak Ditemukan");
              }
          }
      }

## Kata Kunci Continue

Berbeda dengan Break, kata kunci Continue tidak akan menghentikan program saat dieksekusi misalnya menggunakan for loops tapi hanya akan mengskip atau melewatinya saja.

Contohnya seperti berikut ini:

      public class break_continue {
          public static void main(String[] args){
              for(int w=0; w<7; w++){
                  if(w == 4){
                      continue;
                  }else{
                  System.out.println(w);
                  }
              }
          }
      }
      
# Return Pada Java

Return atau di bahasa Indonesia-Kan adalah kembali, return adalah sebuah nilai dalam suatu metode dimana kegunaannya digunakan diluar method atau fungsi pada program Java. Cara menggunakannya kita harus membuat method yang baru untuk menggunakan perintah return biasanya digunakan pada waktu sebuah method yang memiliki nilai pengembalian. Perintah return juga digunakan pada aplikasi seperti kalkulator sebagai class (didalamnya memiliki perintah-perintah program yang akan mengeksekusi penambahan, pengurangan dan juga yang lainnya). Pernyataan return cukup banyak sekali kegunaannya bukan sebagai membuat aplikasi kalkulator saja tapi berfungsi sebagai pemanggil atau pun juga memberikan nilai pada setiap variabel tertentu. Baik langsung saja kita lihat cara penggunaannya di bawah ini.

Contoh Kode Pernyataan Return Pada Java 

      package pernyataan;
      
      public class return {
          public static void main(String[]args){
              int tambah = 20;
              int lain = 5;
              System.out.println("Hasil dari penjumlahan ialah : "+penjumlahan(tambah) + lain);
          }
          static int penjumlahan(int a){
              int hasil = a * a;
              return hasil;
          }
      }

-----
Referensi Artikel:<br>
- <a href="https://www.wildantechnoart.net">Wildan Techno Art</a><br>
- <a href="https://blog.sekolahprogram.com">Blog Sekolah Program</a><br><br>
Referensi Source Code:<br>
<a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.
