/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;
import java.util.List;

/**
 * @author KELOMPOK 14: 
 * FAHREZI FIKRI AL KHAFID 2311103056 
 * FARADHA ATMARIANI 2311103081
 * BRIMA FERNANDA SINUPAYUNG 2211103028 
 * KELAS SI07B
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
