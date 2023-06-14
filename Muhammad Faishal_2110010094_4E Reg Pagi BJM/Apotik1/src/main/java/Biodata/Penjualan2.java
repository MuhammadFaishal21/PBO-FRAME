/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biodata;

/**
 *
 * @author ACER
 */
public class Penjualan2 {
    private String namaBarang;
    private int jumlahBeli;
    private int totalHarga;

    public Penjualan2() {
        namaBarang = "";
        jumlahBeli = 0;
        totalHarga = 0;
    }

    public void tampilkanDetailPenjualan() {
        System.out.println("======= Detail Penjualan =======");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println();
        System.out.println("Total Harga: " + totalHarga);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
}
