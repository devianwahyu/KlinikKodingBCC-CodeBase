package klinikkodingbcc;
/**
 *
 * @author Ibrahimsyah
 */
import java.util.Scanner;

public class KlinikKodingBCC2 {
    
    
    /*
    1. PREDIKSI CUACA
    Baba adalah seorang peramal cuaca, dia bisa meramal cuaca hanya 
    menggunakan beberapa data saja
    Data tersebut adalah suhu udara sekitar dan kondisi awan. Cara baba 
    memprediksi cuaca adalah sebagai berikut
    1. Jika suhu udara saat itu dibawah 20 derajat, maka:
        a. Jika awan TEBAL maka hari itu akan hujan
        b. Jika awan TIDAK ADA maka hari itu akan cerah
        c. Jika awan TIPIS maka hari itu hanya mendung
    2. Jika suhu udara diatas 20 Derajat, maka hari itu akan cerah
    */  

    
    /*
    2. GAJI KARYAWAN   
    Sebuah Perusahaan memiliki sistem penggajian karyawan berdasarkan jam 
    kerja. Gaji pokok setiap karyawan adalah 10000 per hari.
    Karyawan yang bekerja diatas 8jam sehari (Lembur) akan mendapat bonus
    bonus tersebut diberikan sesuai dengan lamanya jam lemburnya dengan
    ketentuan:
       a. 1 Jam = Bonus 2000
       b. 2 Jam = Bonus 4500
       c. 3 Jam = Bonus 7000
       d. diatas 3 Jam = Bonus 3000 x Jumlah Jam
    Buatlah sistem penghitung gaji karyawan sesuai dengan ketentuan diatas
    */
    
    /*
    3. ANGKA ANEH
    Terdapat sebuah angka N dan beberapa kondisi berikut ini
        1. jika N ganjil maka cetak "Aneh"
        2. jika N genap dan diantara 2 dan 5 maka cetak "Tidak Aneh"
        3. jika N genap dan diantara 6 dan 20 maka cetak "Aneh"
        4. jika N genap dan lebih dari 20 maka cetak "Tidak Aneh"
    Buatlah program sederhana sesuai ketentuan diatas
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
//        ~~~Soal 1~~~
//        int suhu;
//        String kondisiAwan, hasilPrediksi;
//        
//        System.out.print("Masukkan suhu: ");
//        suhu = in.nextInt();
//        
//        in.nextLine();
//        
//        if(suhu <= 20) {
//            System.out.print("Masukkan kondisi awan: ");
//            kondisiAwan = in.nextLine();
//            
//            if(kondisiAwan.equalsIgnoreCase("TEBAL")) {
//                hasilPrediksi = "Hujan";
//            } else if(kondisiAwan.equalsIgnoreCase("TIDAK ADA")) {
//                hasilPrediksi = "Cerah";
//            } else if(kondisiAwan.equalsIgnoreCase("TIPIS")) {
//                hasilPrediksi = "Mendung";
//            } else {
//                hasilPrediksi = "Tidak ditemukan";
//            }
//        } else {
//            hasilPrediksi = "Cerah";
//        }
//        System.out.println("Hasil prediksi " + hasilPrediksi);

//        ~~~Soal 2~~~
//         final int gajiPokok = 10000;
//         final int jamPokok = 8;
//         
//         int jamKerja, gajiAkhir;
//         
//         System.out.print("Masukkan jam kerja: ");
//         jamKerja = in.nextInt();
//         
//         if(jamKerja >= jamPokok) {
//             int lembur = jamKerja - jamPokok;
//             
//             if(lembur == 1) {
//                 gajiAkhir = gajiPokok + 2000;
//             } else if(lembur == 2) {
//                 gajiAkhir = gajiPokok + 4500;
//             } else if(lembur == 3) {
//                 gajiAkhir = gajiPokok + 7000;
//             } else if(lembur > 3) {
//                 gajiAkhir = gajiPokok + lembur * 3000;
//             } else {
//                 gajiAkhir = gajiPokok;
//             }
//         } else {
//             gajiAkhir = 0;
//         }
//         
//         System.out.println("Hasil pendapatan = " + gajiAkhir);

//        ~~~Soal 3~~~
//        int n;
//        String hasil;
//        
//        System.out.print("masukkan angka: ");
//        n = in.nextInt();
//        
//        if(n%2 == 0) {
//            if(n>=2 && n<=5) {
//                hasil = "Tidak aneh";
//            } else if(n>=6 && n <=20) {
//                hasil = "Aneh";
//            } else {
//                hasil = "Tidak aneh";
//            }
//        } else {
//            hasil = "Aneh";
//        }
//        
//        System.out.println("Angka tersebut " + hasil);
    }
}
