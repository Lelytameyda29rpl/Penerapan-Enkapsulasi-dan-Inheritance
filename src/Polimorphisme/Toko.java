/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphisme;

/**
 *
 * @author MOKLET-2
 */
public class Toko {
    //Mendeklarasikan Variabel
    private String admin;
    int harga;
    int Totalunit;
    String merk;
    
    //Method Display
    public void display(){
        System.out.println("Data barang yang di entry: ");
    }
    //Method setter untuk Admin
    public void setAdmin(String admin){//Yang di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.admin = admin;
    }
    //Method getter untuk Admin
    public String getAdmin(){
        System.out.println("Admin: "+admin);
    //Mengoutputkan nilai dari sebuah fungsi
        return admin;
    }
    
}
