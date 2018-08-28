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
class Kasir extends Pembeli {

    private String tanggal;
    private String namakasir;

    public Kasir(String tanggal, String namakasir, int id_pembeli, String namapembeli, String alamat, String no_telp, int id_barang, String namabarang, String merkbarang,  int hargabarang) 
    {
        super(id_pembeli, namapembeli, alamat, no_telp, id_barang, namabarang, merkbarang, hargabarang);
        this.tanggal = tanggal;
        this.namakasir = namakasir;
    }
    
    public void brg()
    {
        System.out.println("Tanggal         : "+this.tanggal);
        System.out.println("Nama Kasir      : "+this.namakasir);
        super.brg();
    }   
    
    
    
}
