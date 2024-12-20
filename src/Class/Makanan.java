/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author FAHREZI FIKRI AL KHAFID_2311103056_SI07B
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
