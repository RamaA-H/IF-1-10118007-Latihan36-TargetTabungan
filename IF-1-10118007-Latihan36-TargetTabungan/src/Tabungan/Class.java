package Tabungan;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Saldo tabungan perbulan hingga target yang ditentukan
 * @author Rama
 */
public class Class {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		  targetTabungan nabung = new targetTabungan();
        nabung.saldo = 3500000;
        nabung.bunga = 8;
        int saldoTarget = 6000000;
        
        nabung.targetBulanan(nabung.saldo, saldoTarget);
	}

}