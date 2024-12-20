/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author FAHREZI FIKRI AL KHAFID_2311103056_SI07B
 */
public class Minuman extends Menu {

    private String namaMinuman;

    public Minuman(String namaMinuman, double harga) {
        super(harga);
        this.namaMinuman = namaMinuman;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }
}
