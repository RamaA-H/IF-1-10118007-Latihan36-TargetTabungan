package Tabungan;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Saldo tabungan perbulan hingga target yang ditentukan
 * @author Rama
 */
public class targetTabungan {

	public int bunga;
	public int saldo;


	public double hitungBunga(int parSaldo, int parBunga) {
		    return parSaldo * parBunga / 100;
	}


	public void targetBulanan(int parSaldo, int parSaldoTarget) {
		  int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo, bunga);
            parSaldo += hitungBunga(parSaldo, bunga);
            String hasilSaldo = String.format("%,3d", parSaldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-%d Rp. %s%n", i, hasilSaldo);
            i++;

        }
	}

}