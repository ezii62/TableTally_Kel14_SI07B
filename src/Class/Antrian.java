/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.List;

/**
 *
 * @author FAHREZI FIKRI AL KHAFID_2311103056_SI07B
 */
public class Antrian {

    private String idAntrian;
    private List<Pesanan> listPesanan;
    private String status; // "Done","Cancel"
    

    public Antrian(String idAntrian) {
        this.idAntrian = idAntrian;
        this.status = "Done";
    }

    public void tambaAntrian(Pesanan pesanan) {
        listPesanan.add(pesanan);
    }
}
