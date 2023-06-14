/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;

import java.util.ArrayList;


public class DatasetPelanggan {
     private ArrayList<String> nama;
     private ArrayList<String> alamat;
    private ArrayList<String> telepon;
    
    public DatasetPelanggan(){
       nama= new ArrayList<String>();
      alamat= new ArrayList<String>();
      telepon= new ArrayList<String>();   
    
    }
    public void tambahnama(String value){
        nama.add(value);
    }
     public ArrayList<String> getDatasetnama(){
        return this.nama;
    }
     
     public void tambahalamat(String value){
        alamat.add(value);
    }
     public ArrayList<String> getDatasetalamat(){
        return this.alamat;
    }  
 public void tambahtelepon(String value){
        telepon.add(value);
    }
     public ArrayList<String> getDatasettelepon(){
        return this.telepon;
    }  

    public Object getDatasetelepon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

