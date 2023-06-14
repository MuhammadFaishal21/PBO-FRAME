
package Biodata;



public class Barang {
    private String nama;
    private String harga;
    private String stok;
    private String jenisBarang;

    public Barang(String nama, String harga, String stok, String jenisBarang) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.jenisBarang = jenisBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void tampilkanInfoBarang() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Jenis Barang: " + jenisBarang);
    }
}
