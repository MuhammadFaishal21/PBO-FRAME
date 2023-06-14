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
public class Datasetjenis_Barang {
    private ArrayList<String> nama;
    private ArrayList<String> keterangan;
    
    
   public Datasetjenis_Barang(){
     nama= new ArrayList<String>();
     keterangan= new ArrayList<String>();
    
}
     public void tambahnama(String value){
        nama.add(value);
    }
     public ArrayList<String> getDatasetnama(){
        return this.nama;
    }
     
     public void tambahketerangan(String value){
        keterangan.add(value);
    }
     public ArrayList<String> getDatasetketerangan(){
        return this.keterangan;
    }
}