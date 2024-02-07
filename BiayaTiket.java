package biayatiket;
import java.util.Scanner;
public class BiayaTiket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        //input
        System.out.print("Masukkan hari (Minggu, Senin, Selasa, Rabu, Kamis, Jumat) : ");
        String hari = input.nextLine();
        
        System.out.print("Masukkan (libur atau tidak libur) : ");
        String libur = input.nextLine();
        
        System.out.print("Masukkan jumlah tiket yang dibeli : ");
        int jumlahTiket = input.nextInt();
        
        double hargaTiket = 0;
        
            // Menghitung harga tiket berdasarkan hari
        if (hari.equalsIgnoreCase("Senin") || hari.equalsIgnoreCase("Selasa") ||
            hari.equalsIgnoreCase("Rabu") || hari.equalsIgnoreCase("Kamis")) {
            hargaTiket = 75000;
        } else if (hari.equalsIgnoreCase("Jumat") || hari.equalsIgnoreCase("Sabtu") ||
                   hari.equalsIgnoreCase("Minggu")) {
            hargaTiket = 100000;
        } else {
            System.out.println("Hari tidak valid");
            System.exit(0);
        }
        
        // Menghitung harga tiket berdasarkan libur atau tidak
        if (libur.equalsIgnoreCase("Ya")) {
            hargaTiket = 125000;
            
        //Menghitung Total Biaya
        double totalBiayaTiket = hargaTiket * jumlahTiket ;
        
        // Output Total Biaya Tiket
        System.out.println("Total Biaya Tiket : Rp"+totalBiayaTiket);
        }
    }
    
}
