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

public class Staff_Dapur extends Pengguna{
    public Staff_Dapur(String username, String password, String role) throws ValidasiInputException {
        super(username, password, "dapur");
        
        if (username == null || username.isEmpty()) {
            throw new ValidasiInputException("Username tidak boleh kosong!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }
    }
}
