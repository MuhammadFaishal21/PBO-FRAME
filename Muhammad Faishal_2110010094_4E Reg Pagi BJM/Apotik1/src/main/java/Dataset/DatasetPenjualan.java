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
public class DatasetPenjualan {
     private ArrayList<String> listBarang;
     private ArrayList<Integer> totalHarga;
    private ArrayList<Integer> counter;
    
    public DatasetPenjualan(){
       listBarang= new ArrayList<String>();
      totalHarga= new ArrayList<Integer>();
      counter= new ArrayList<Integer>();   
    
}
 public void tambahlistBarang(String value){
        listBarang.add(value);
    }
     public ArrayList<String> getDatasetlistBarang(){
        return this.listBarang;
    }
     
     public void tambahtotalHarga(Integer value){
        totalHarga.add(value);
    }
     public ArrayList<Integer> getDatasettotalHarga(){
        return this.totalHarga;
    }  
 public void counter(Integer value){
        counter.add(value);
    }
     public ArrayList<Integer> getDatasetcounter(){
        return this.counter;
    }  
}

