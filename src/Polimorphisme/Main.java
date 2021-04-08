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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mendeklarasikan object
        Toko object1 = new Toko();
        SmartPhone object2 = new SmartPhone();
        TV object3 = new TV();
        KipasAngin object4 = new KipasAngin();
        
        //Untuk menampilkan atau pemanggilan class Toko       
        object1.setAdmin("Lelyta");
        object1.getAdmin();
        
        //Untuk menampilkan atau pemanggilan class SmartPhone 
        System.out.println("================================");
        System.out.println("Menampilkan Data Toko SmartPhone");
        System.out.println("================================");
        object2.setHarga(2499000);
        object2.setTotal(2);
        object2.setMerk("OPPO A53");
        object2.setjmlKamera(4);
        object2.display();
        
        //Untuk menampilkan atau pemanggilan class TV
        System.out.println("========================");
        System.out.println("Menampilkan Data Toko TV");
        System.out.println("========================");
        object3.setHarga(3375000);
        object3.setTotal(1);
        object3.setMerk("Panasonic");
        object3.setJenis("LED");
        object3.display();
        
        //Untuk menampilkan atau pemanggilan class KipasAngin
        System.out.println("=================================");
        System.out.println("Menampilkan Data Toko Kipas Angin");
        System.out.println("=================================");
        object4.setHarga(250000);
        object4.setTotal(3);
        object4.setMerk("Maspion");
        object4.setukuran("16 inchi");
        object4.display();
    }
    
}
