package nilaihuruf;
import java.util.Scanner;
public class NilaiHuruf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input nilai tugas
        System.out.print("Masukkan nilai tugas 1 : ");
        double tugas1 = input.nextDouble();
        
        System.out.print("Masukkan nilai tugas 2 : ");
        double tugas2 = input.nextDouble();
        
        System.out.print("Masukkan nilai tugas 3 : ");
        double tugas3 = input.nextDouble();
        
        //input nilai uts
        System.out.print("Masukkan nilai uts : ");
        double uts = input.nextDouble();
        
        //input nilai uas
        System.out.print("Masukkan nilai uas : ");
        double uas = input.nextDouble();
        
        //menghitung nilai akhir
        double nilaiTugas = tugas1 + tugas2 + tugas3 / 3;
        double nilaiAkhir = (nilaiTugas * 0.30)+(uts * 0.30)+(uas * 0.40);
        
        //menampilkan nilai akhir
        System.out.println("Nilai akhir : "+nilaiAkhir);
        
        //konversi nilai menjadi huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E"; 
        }
        //Menampilkan nilai huruf  
        System.out.println("Nilai Huruf: " + nilaiHuruf);
    }       
    
    
}
