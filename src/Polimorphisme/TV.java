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
public class TV extends Toko {
    String Jenis;
    
    //Method untuk setter harga
    public void setHarga(int harga){//Yang di dalam tanda kurung adalah parameter
    //Untuk memanggil method tertentu dari class induk (class Toko)
        super.harga = harga;
    }
    //Method untuk getter harga
    public int getHarga(){
    //Mengoutputkan nilai dari sebuah fungsi
        return harga;
    }
    //Method untuk setter Total
    public void setTotal(int Totalunit){//Yang di dalam tanda kurung adalah parameter
    //Untuk memanggil method tertentu dari class induk (class Toko)
        super.Totalunit = Totalunit;
    }
    //Method untuk getter Total
    public int getTotal(){
    //Mengoutputkan nilai dari sebuah fungsi
        return Totalunit;
    }
    //Method untuk setter merk
    public void setMerk(String merk){//Yang di dalam tanda kurung adalah parameter
    //Untuk memanggil method tertentu dari class induk (class Toko)
        super.merk = merk;
    }
    //Method untuk getter merk
    public String getMerk(){
    //Mengoutputkan nilai dari sebuah fungsi
        return merk;
    }
    //Method untuk setter Jenis
    public void setJenis(String Jenis){//Yang di dalam tanda kurung adalah parameter
    //this.variabel digunakan untuk mengakses variabel instance yang dibayangi oleh parameter
        this.Jenis = Jenis;
    }
    //Method untuk getter Jenis
    public String getJenis(){
    //Mengoutputkan nilai dari sebuah fungsi
        return Jenis;
    }
    //Menerapkan Overriding
    public void display(){
        System.out.println("Data barang yang di entry: ");
        System.out.println("Harga: "+getHarga());
        System.out.println("Total Unit: "+getTotal());
        System.out.println("Merk: "+getMerk());
        System.out.println("Jenis: "+getJenis());
    }
    
}
