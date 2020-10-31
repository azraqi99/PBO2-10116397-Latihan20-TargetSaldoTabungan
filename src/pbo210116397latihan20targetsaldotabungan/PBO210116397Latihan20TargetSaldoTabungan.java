/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Target Saldo Tabungan
 */
package pbo210116397latihan20targetsaldotabungan;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int saldoTab = 3500000;
        double bungaBul = 0.08;
        double saldoBul;

        while (saldoTab <= 6000000) {

            saldoBul = bungaBul * saldoTab;
            saldoTab = (int) (saldoTab + saldoBul);
            System.out.println("Saldo di bulan ke-" + i + " Rp. "
                    + saldoTab);
            i++;
        }
    }
    
}
