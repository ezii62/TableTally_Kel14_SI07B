/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * @author KELOMPOK 14: 
 * FAHREZI FIKRI AL KHAFID 2311103056 
 * FARADHA ATMARIANI 2311103081
 * BRIMA FERNANDA SINUPAYUNG 2211103028 
 * KELAS SI07B
 */

public class Makanan extends Menu{
    private String namaMakanan;

    public Makanan(String namaMakanan, double harga) {
        super(harga);
        this.namaMakanan = namaMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }
}
