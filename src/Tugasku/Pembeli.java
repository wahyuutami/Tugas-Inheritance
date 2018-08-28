/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugasku;

/**
 *
 * @author WINDOWS 10
 */
class Pembeli extends Toko {
   private int id_pembeli;
   private String namapembeli, alamat, no_telp;

    public Pembeli(int id_pembeli, String namapembeli, String alamat, String no_telp, int id_barang, String namabarang, String merkbarang,  int hargabarang) 
    {
        super(id_barang, namabarang, merkbarang, hargabarang);
        this.id_pembeli = id_pembeli;
        this.namapembeli = namapembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    public void brg()
    {
        System.out.println("ID Pembeli      : "+this.id_pembeli);
        System.out.println("Nama Pembeli    : "+this.namapembeli);
        System.out.println("Alamat          : "+this.alamat);
        System.out.println("No. Telepon     : "+this.no_telp);
        super.brg();
    }
    
    
   
   
}
