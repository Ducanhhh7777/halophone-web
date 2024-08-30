/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class nguoidung {
    int id_nd;
   String tai_khoan;
   String mat_khau;
   String ten_nguoidung;
    private int isAdmin;
   
   public nguoidung(){
    }

    public nguoidung(int id_nd, String tai_khoan, String mat_khau, String ten_nguoidung, int isAdmin) {
        this.id_nd = id_nd;
        this.tai_khoan = tai_khoan;
        this.mat_khau = mat_khau;
        this.ten_nguoidung = ten_nguoidung;
         this.isAdmin = isAdmin;
    }

    public int getId_nd() {
        return id_nd;
    }

    public void setId_nd(int id_nd) {
        this.id_nd = id_nd;
    }

    public String getTai_khoan() {
        return tai_khoan;
    }

    public void setTai_khoan(String tai_khoan) {
        this.tai_khoan = tai_khoan;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public String getTen_nguoidung() {
        return ten_nguoidung;
    }

    public void setTen_nguoidung(String ten_nguoidung) {
        this.ten_nguoidung = ten_nguoidung;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
   
   
}
