/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.List;

/**
 * @author KELOMPOK 14: 
 * FAHREZI FIKRI AL KHAFID 2311103056 
 * FARADHA ATMARIANI 2311103081
 * BRIMA FERNANDA SINUPAYUNG 2211103028 
 * KELAS SI07B
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
