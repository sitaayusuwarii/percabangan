package kasus1totalbiaya;
import java.util.Scanner;
public class Kasus1TotalBiaya {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input golongan pegawai
        System.out.print("Masukkan jenis pegawai (Staff/Non Staff : ");
        String jenis = input.nextLine();
        
        System.out.print("Masukkan umur dalam tahun : ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan lama bekerja dalam tahun : ");
        int lamaKerja = input.nextInt();
        
        double bonus = 0;
        
        if (jenis.equalsIgnoreCase("Staff")) {
            if ( lamaKerja >= 5 && umur >= 50 ) {
            bonus = 1000000;
            } else {
            bonus = 500000; }
            
        } else if (jenis.equalsIgnoreCase("Non Staff"))
            if ( lamaKerja >= 5 && umur >= 50 ) {
            bonus = 400000;
            } else {
            bonus = 250000; }
        
        double bonusPegawai = bonus * lamaKerja;
        
         //hasil
        System.out.println("Bonus pegawai : Rp"+bonus);
        
        
        
        

        
        
    }
    
}
