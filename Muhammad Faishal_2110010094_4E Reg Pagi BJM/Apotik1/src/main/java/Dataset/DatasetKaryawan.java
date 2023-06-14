/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;

import java.util.ArrayList;

public class DatasetKaryawan {
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> namaKaryawan;
    private ArrayList<String> alamat;
    private ArrayList<String> JenisKelamin;
    private ArrayList<String> nomorTelepon;
    
  public DatasetKaryawan(){
       username= new ArrayList<String>();
        password= new ArrayList<String>();
        namaKaryawan= new ArrayList<String>();
        alamat= new ArrayList<String>();
        JenisKelamin= new ArrayList<String>();
        nomorTelepon= new ArrayList<String>();
  }
    public void tambahusername(String value){
        username.add(value);
    }
     public ArrayList<String> getDatasetusername(){
        return this.username;
    }
     
     public void tambahpassword(String value){
        password.add(value);
    }
     public ArrayList<String> getDatasetpassword(){
        return this.password;
    }
     
     public void tambahnamaKaryawan(String value){
        namaKaryawan.add(value);
    }
     public ArrayList<String> getDatasetnamaKaryawan(){
        return this.namaKaryawan;
    }
     
     public void tambahalamat(String value){
        alamat.add(value);
    }
     public ArrayList<String> getDatasetalamat(){
        return this.alamat;
    }
      public void tambahJenisKelamin(String value){
        JenisKelamin.add(value);
    }
     public ArrayList<String> getDatasetJenisKelamin(){
        return this.JenisKelamin;
    }
      public void tambahnomorTelepon(String value){
       nomorTelepon.add(value);
    }
     public ArrayList<String> getDatasetnomorTelepon(){
        return this.nomorTelepon;
    }
     
}
 

