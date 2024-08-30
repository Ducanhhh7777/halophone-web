/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class chitiet_hd {
    int id_cthd;
    int id_hd;
    int id_sp;
    int soluong_mua;
    int don_gia;
    
    public chitiet_hd(){
        
    }

    public chitiet_hd(int id_cthd, int id_hd, int id_sp, int soluong_mua, int don_gia) {
        this.id_cthd = id_cthd;
        this.id_hd = id_hd;
        this.id_sp = id_sp;
        this.soluong_mua = soluong_mua;
        this.don_gia = don_gia;
    }

    public int getId_cthd() {
        return id_cthd;
    }

    public void setId_cthd(int id_ctdh) {
        this.id_cthd = id_cthd;
    }

    public int getId_hd() {
        return id_hd;
    }

    public void setId_hd(int id_hd) {
        this.id_hd = id_hd;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public int getSoluong_mua() {
        return soluong_mua;
    }

    public void setSoluong_mua(int soluong_mua) {
        this.soluong_mua = soluong_mua;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }
    
}
