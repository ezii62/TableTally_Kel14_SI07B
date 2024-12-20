/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;
import java.util.List;

/**
 *
 * @author FAHREZI FIKRI AL KHAFID_2311103056_SI07B
 */
public class Transaksi {
    private String idTransaksi;
    private List<Makanan> listMakanan;
    private List<Minuman> listMinuman;
    private double totalHarga;
    private Date waktuPembelian;

    public Transaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
    public void tambahMakanan(Makanan makanan) {
        listMakanan.add(makanan);
    }
    
    public void tambahMinuman(Minuman minuman) {
        listMinuman.add(minuman);
    }
}
