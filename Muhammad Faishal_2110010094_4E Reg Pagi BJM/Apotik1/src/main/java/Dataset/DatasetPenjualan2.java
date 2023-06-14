/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class DatasetPenjualan2 {
     private  ArrayList<String>namaBarang;
    private  ArrayList<Integer> jumlahBeli;
    private  ArrayList<Integer> totalHarga;

    public DatasetPenjualan2() {
        namaBarang=new ArrayList<String>();
        jumlahBeli =new ArrayList<Integer>();
        totalHarga =new ArrayList<Integer>();
    }
    public void tambahnamaBarang(String value){
        namaBarang.add(value);
    }
     public ArrayList<String> getDatasetnamaBarang(){
        return this.namaBarang;
    }
     
     public void tambahjumlahBeli(Integer value){
        jumlahBeli.add(value);
    }
     public ArrayList<Integer> getDatasetjumlahBeli(){
        return this.jumlahBeli;
    }  
 public void tambahtotalHarga(Integer value){
         totalHarga.add(value);
    }
     public ArrayList<Integer> getDatasettotalHarga(){
        return this. totalHarga;
    }  
}



