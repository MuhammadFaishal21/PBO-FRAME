/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apotik1;

import Biodata.Barang;
import Biodata.Jenis_Barang;
import Biodata.Karyawan;
import Biodata.Pelanggan;
import Biodata.Pemasok;
import Biodata.Penjualan;
import Form.Frompertama;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class Apotik1 {

    public static void main(String[] args) {
    
/*Karyawan karyawan1 = new Karyawan("Muhammad", "1234", "Muhammad Faishal", "Flamboyan", "Laki-laki");
karyawan1.tampilkanInfoKaryawan();
ArrayList<String> noTelepon=new ArrayList<String>();
System.out.print("noTelepon: ");

noTelepon.add("082252178090");
noTelepon.add("082252178091");
noTelepon.add("082252178092");
System.out.println(noTelepon.get(1));

ArrayList<String> stok =new ArrayList<String>();
System.out.print("stok: ");
stok.add("100 ");
stok.add("200");
System.out.println(stok.get(1));

Jenis_Barang jenis1 = new Jenis_Barang("Obat Keras", "Obat yang harus diberikan sesuai resep dokter");
jenis1.tampilkanInfoJenis_Barang();

//penjualan
Jenis_Barang jenis2 = new Jenis_Barang("Obat Keras", "Obat yang harus diberikan sesuai resep dokter");
Barang barang1 = new Barang("Paracetamol", 1500, 100, jenis1);
Barang barang2 = new Barang("Amoxicillin", 1500, 50, jenis1);
Penjualan penjualan1 = new Penjualan();
penjualan1.tambahBarang(barang1);
penjualan1.tambahBarang(barang2);
penjualan1.tampilkanDetailPenjualan();


//pelanggan
Pelanggan pelanggan1 = new Pelanggan("Ahmad", "Jl. Merdeka No. 10", "08123456789");
System.out.println(pelanggan1.getNama()); // Output: Ahmad
System.out.println(pelanggan1.getAlamat()); // Output: Jl. Merdeka No. 10
System.out.println(pelanggan1.getTelepon()); // Output: 08123456789

pelanggan1.setTelepon("08111111111");
System.out.println(pelanggan1.getTelepon()); // Output: 08111111111


 Pemasok pemasok1 = new Pemasok("PT. ABC", "Jl. Merdeka No. 10", "08123456789");
        System.out.println("Nama Pemasok: " + pemasok1.getNama());
        System.out.println("Alamat Pemasok: " + pemasok1.getAlamat());
        System.out.println("Nomor Telepon Pemasok: " + pemasok1.getNomorTelepon());*/
Frompertama myFrom = new Frompertama();

myFrom.setVisible(true);
    }

   }
