/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku.controller;

import buku.model.staff;
//import buku.views.InputKarcis;
import buku.views.login;
//import buku.views.utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

/**
 *
 * @author fachr
 */
public class logincontroller implements ActionListener{

    login view;
    staff karyawan;
    
    private static final Logger LOG = Logger.getLogger(logincontroller.class.getName());
    
    public logincontroller(login view){
        this.view=view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==view.getjButton2()){
//            view.setVisible(false);
//            InputKarcis i = new InputKarcis();
//            i.setVisible(true);
//            LOG.info("Berpindah Halaman ke halaman Input Karcis Parkir");
//            return;
//        }
        karyawan = new staff(view.getTextField1(),view.getPasswordField1());
        if(karyawan.getKaryawanByUsername()){
            LOG.info("Login Berhasil");
            view.setVisible(false);
            //utama mainForm = new utama();
            //mainForm.setVisible(true);
            LOG.info("Berpindah Halaman ke halaman utama");
        }else{
            view.showMessage("Login Gagal Username/Password Salah");
            LOG.info("Login Gagal");
        }
    }
    
    private staff _getKaryawan(){
        
        return null;
    }
}
