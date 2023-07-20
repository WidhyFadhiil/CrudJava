/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form_login;

/**
 *
 * @author USER
 */
public class Form_login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        koneksi k = new koneksi();
        k.koneksi();
        login l = new login();
        l.setVisible(true);
    }
    
}
