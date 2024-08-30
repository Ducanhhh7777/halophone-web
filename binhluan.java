/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class binhluan {
        int id_binhluan;
	int id_sp;
	String ho_ten;
	Date ngay_gio;
	String noi_dung;
	String dien_thoai;
        
        public binhluan(){
            
        }

    public binhluan(int id_binhluan, int id_sp, String ho_ten, Date ngay_gio, String noi_dung, String dien_thoai) {
        this.id_binhluan = id_binhluan;
        this.id_sp = id_sp;
        this.ho_ten = ho_ten;
        this.ngay_gio = ngay_gio;
        this.noi_dung = noi_dung;
        this.dien_thoai = dien_thoai;
    }

    public int getId_binhluan() {
        return id_binhluan;
    }

    public void setId_binhluan(int id_binhluan) {
        this.id_binhluan = id_binhluan;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public Date getNgay_gio() {
        return ngay_gio;
    }

    public void setNgay_gio(Date ngay_gio) {
        this.ngay_gio = ngay_gio;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public String getDien_thoai() {
        return dien_thoai;
    }

    public void setDien_thoai(String dien_thoai) {
        this.dien_thoai = dien_thoai;
    }
        
}
