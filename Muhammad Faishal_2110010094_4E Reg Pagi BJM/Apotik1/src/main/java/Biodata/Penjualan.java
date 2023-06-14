
package Biodata;


/**
 *
 * @author ACER
 */
public class Penjualan {
    private String[]listBarang;
    private int totalHarga;
    private int counter;

    public Penjualan() {
        listBarang = new String[10]; // Menggunakan array dengan ukuran tetap
        totalHarga = 0;
        counter = 0;
    }

    public void tambahBarang(String barang) {
        listBarang[counter] = barang;
        counter++;
    }

    public void tampilkanDetailPenjualan() {
        System.out.println("======= Detail Penjualan =======");
        for (int i = 0; i < counter; i++) {
            System.out.println("Nama Barang: " + listBarang[i]);
        }
        System.out.println("Total Harga: " + totalHarga);
    }
}
