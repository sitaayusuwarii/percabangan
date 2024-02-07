
package totalnilaibelanja;
import java.util.Scanner;
public class TotalNilaiBelanja {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input
        System.out.print("Masukkan total belanja : ");
        double totalBelanja = input.nextDouble();
        
        int diskon = 0;
        
        if (totalBelanja >= 100000)
            diskon = (int) (totalBelanja * 0.1);
        else if ( totalBelanja >= 150000)
            diskon = (int) (totalBelanja * 0.15);
        else if ( totalBelanja >= 200000)
            diskon = (int) (totalBelanja * 0.20);
        else if ( totalBelanja >= 250000 )
            diskon = (int) (totalBelanja * 0.25);
        
        //Menghitung total nilai belanja
        double nilaiYangDibayar = totalBelanja - diskon;
        
        //Output diskon dan nilai yang harus dibayar
        System.out.println("Nilai diskon dalam rupiah : Rp"+diskon);
        System.out.println("Nilai yang harus dibayar : Rp"+nilaiYangDibayar);
    }
    
}
