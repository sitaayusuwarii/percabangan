
package totalbiayaiklan;
import java.util.Scanner;
public class TotalBiayaIklan {

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("Masukkan hari (Minggu, Senin, Selasa, Rabu, Kamis, Jumat Sabtu) : ");
        String hari = input.nextLine();
        
        System.out.print("Masukkan jumlah baris : ");
        int jumlahBaris = input.nextInt();
        
        double tarifPerBaris = 0;
        
        // Menghitung tarif per baris berdasarkan hari
        if (hari.equalsIgnoreCase("Minggu") || hari.equalsIgnoreCase("Sabtu")) {
            tarifPerBaris = 40000;
        } else {
            tarifPerBaris = 30000;
        }
        
         // Menghitung total biaya iklan
        double totalBiaya = tarifPerBaris * jumlahBaris;
        
        // Menghitung diskon jika jumlah baris lebih dari 10
        if (jumlahBaris > 10) {
            int diskon = 5000 * (jumlahBaris - 10);
            totalBiaya -= diskon;
        }
        
        // Output total biaya iklan
        System.out.println("Total biaya iklan yang harus dibayar: Rp. " + totalBiaya);
    }
    
}
