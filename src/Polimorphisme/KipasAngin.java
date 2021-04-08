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
//Menerapkan keyword extends
public class KipasAngin extends Toko {
    String ukuran;
    
    //Method setter untuk harga
     public void setHarga(int harga){//Yang di dalam tanda kurung adalah parameter
    //Untuk memanggil method tertentu dari class induk (class Toko)
        super.harga = harga;
    }
    //Method getter untuk harga
    public int getHarga(){
    //Mengoutputkan nilai dari sebuah fungsi
        return harga;
    }
    //Method setter untuk Total
    public void setTotal(int Totalunit){//Yang di dalam tanda kurung adalah parameter
    //Untuk memanggil method tertentu dari class induk (class Toko)
        super.Totalunit = Totalunit;
    }
    //Method getter untuk Total
    public int getTotal(){
    //Mengoutputkan nilai dari sebuah fungsi
        return Totalunit;
    }
    //Method setter untuk merk
    public void setMerk(String merk){//Yang di dalam tanda kurung adalah parameter
    //Untuk memanggil method tertentu dari class induk (class Toko)
        super.merk = merk;
    }
    //Method getter untuk merk
    public String getMerk(){
    //Mengoutputkan nilai dari sebuah fungsi
        return merk;
    }
    //Method setter untuk ukuran
    public void setukuran(String ukuran){//Yang di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.ukuran = ukuran;
    }
    //Method getter untuk ukuran
    public String getukuran(){
    //Mengoutputkan nilai dari sebuah fungsi
        return ukuran;
    }
    //Menerapkan Overriding
    public void display(){
        System.out.println("Data barang yang di entry: ");
        System.out.println("Harga: "+getHarga());
        System.out.println("Total Unit: "+getTotal());
        System.out.println("Merk: "+getMerk());
        System.out.println("Ukuran: "+getukuran());
    }
    
}
