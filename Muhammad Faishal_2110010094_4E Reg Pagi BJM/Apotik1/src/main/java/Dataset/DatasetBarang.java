/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;

import java.util.ArrayList;


    public class DatasetBarang {
    private ArrayList<String> nama;
    private ArrayList<String> harga;
    private ArrayList<String> stok;
    private ArrayList<String> jenisBarang;
    
  public DatasetBarang(){
       nama= new ArrayList<String>();
        harga= new ArrayList<String>();
        stok= new ArrayList<String>();
        jenisBarang= new ArrayList<String>();
  }
    public void tambahnama(String value){
        nama.add(value);
    }
     public ArrayList<String> getDatasetnama(){
        return this.nama;
    }
     
     public void tambahharga(String value){
        harga.add(value);
    }
     public ArrayList<String> getDatasetharga(){
        return this.harga;
    }
     
     public void tambahstok(String value){
        stok.add(value);
    }
     public ArrayList<String> getDatasetstok(){
        return this.stok;
    }
     
     public void jenisBarang(String value){
        jenisBarang.add(value);
    }
     public ArrayList<String> getDatasetjenisBarang(){
        return this.jenisBarang;
    }

    public void tambahjenisBarang(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
 


    

