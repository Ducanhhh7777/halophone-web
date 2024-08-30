/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class sanpham {
    int id_sp;
    int id_dm;
    int id_cacloai;
    String ten_sp;
    String anh_sp;
    int gia_sp ;
    String kich_thuoc;
    String trong_luong ;
    String mau_sac ;
    String am_thanh ;
    String bo_nho ;
    String he_dieu_hanh ;
    String the_nho ;
    String camera ;
    String pin ;
    String bao_hanh ;
    String ket_noi ;
    
    public sanpham(){
        
    }

    public sanpham(int id_sp, int id_dm, int id_cacloai, String ten_sp, String anh_sp, int gia_sp, String kich_thuoc, String trong_luong, String mau_sac, String am_thanh, String bo_nho, String he_dieu_hanh, String the_nho, String camera, String pin, String bao_hanh, String ket_noi) {
        this.id_sp = id_sp;
        this.id_dm = id_dm;
        this.id_cacloai = id_cacloai;
        this.ten_sp = ten_sp;
        this.anh_sp = anh_sp;
        this.gia_sp = gia_sp;
        this.kich_thuoc = kich_thuoc;
        this.trong_luong = trong_luong;
        this.mau_sac = mau_sac;
        this.am_thanh = am_thanh;
        this.bo_nho = bo_nho;
        this.he_dieu_hanh = he_dieu_hanh;
        this.the_nho = the_nho;
        this.camera = camera;
        this.pin = pin;
        this.bao_hanh = bao_hanh;
        this.ket_noi = ket_noi;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public int getId_dm() {
        return id_dm;
    }

    public void setId_dm(int id_dm) {
        this.id_dm = id_dm;
    }

    public int getId_cacloai() {
        return id_cacloai;
    }

    public void setId_cacloai(int id_cacloai) {
        this.id_cacloai = id_cacloai;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public String getAnh_sp() {
        return anh_sp;
    }

    public void setAnh_sp(String anh_sp) {
        this.anh_sp = anh_sp;
    }

    public int getGia_sp() {
        return gia_sp;
    }

    public void setGia_sp(int gia_sp) {
        this.gia_sp = gia_sp;
    }

    public String getKich_thuoc() {
        return kich_thuoc;
    }

    public void setKich_thuoc(String kich_thuoc) {
        this.kich_thuoc = kich_thuoc;
    }

    public String getTrong_luong() {
        return trong_luong;
    }

    public void setTrong_luong(String trong_luong) {
        this.trong_luong = trong_luong;
    }

    public String getMau_sac() {
        return mau_sac;
    }

    public void setMau_sac(String mau_sac) {
        this.mau_sac = mau_sac;
    }

    public String getAm_thanh() {
        return am_thanh;
    }

    public void setAm_thanh(String am_thanh) {
        this.am_thanh = am_thanh;
    }

    public String getBo_nho() {
        return bo_nho;
    }

    public void setBo_nho(String bo_nho) {
        this.bo_nho = bo_nho;
    }

    public String getHe_dieu_hanh() {
        return he_dieu_hanh;
    }

    public void setHe_dieu_hanh(String he_dieu_hanh) {
        this.he_dieu_hanh = he_dieu_hanh;
    }

    public String getThe_nho() {
        return the_nho;
    }

    public void setThe_nho(String the_nho) {
        this.the_nho = the_nho;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getBao_hanh() {
        return bao_hanh;
    }

    public void setBao_hanh(String bao_hanh) {
        this.bao_hanh = bao_hanh;
    }

    public String getKet_noi() {
        return ket_noi;
    }

    public void setKet_noi(String ket_noi) {
        this.ket_noi = ket_noi;
    }
    
    
}
