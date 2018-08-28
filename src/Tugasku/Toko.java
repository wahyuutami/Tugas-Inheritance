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
class Toko {
    public int id_barang, hargabarang;
    public String namabarang,merkbarang;

    public Toko(int id_barang, String namabarang, String merkbarang, int hargabarang) {
        this.id_barang = id_barang;
        this.hargabarang = hargabarang;
        this.namabarang = namabarang;
        this.merkbarang = merkbarang;
    }
    
    public void brg()
    {
        System.out.println("ID Barang       : "+this.id_barang);
        System.out.println("Nama Barang     : "+this.namabarang);
        System.out.println("Merk Barang     : "+this.merkbarang);
        System.out.println("Harga Barang    : "+this.hargabarang);
    }
}



