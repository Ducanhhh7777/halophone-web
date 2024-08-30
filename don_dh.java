/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class don_dh {

    int id_hd;
    int id_kh;
    Date ngaytao_dh;
    int tong_gia;

    public List<chitiet_hd> getListOrderDetails() {
        return listOrderDetails;
    }

    public void setListOrderDetails(List<chitiet_hd> listOrderDetails) {
        this.listOrderDetails = listOrderDetails;
    }
    String noi_nhan;
    String ghi_chu;
    List<chitiet_hd> listOrderDetails = new ArrayList<>();

    public don_dh() {

    }

    public don_dh(int id_hd, int id_kh, Date ngaytao_dh, int tong_gia, String noi_nhan, String ghi_chu) {
        this.id_hd = id_hd;
        this.id_kh = id_kh;
        this.ngaytao_dh = ngaytao_dh;
        this.tong_gia = tong_gia;
        this.noi_nhan = noi_nhan;
        this.ghi_chu = ghi_chu;
    }

    public int getId_hd() {
        return id_hd;
    }

    public void setId_hd(int id_hd) {
        this.id_hd = id_hd;
    }

    public int getId_kh() {
        return id_kh;
    }

    public void setId_kh(int id_kh) {
        this.id_kh = id_kh;
    }

    public Date getNgaytao_dh() {
        return ngaytao_dh;
    }

    public void setNgaytao_dh(Date ngaytao_dh) {
        this.ngaytao_dh = ngaytao_dh;
    }

    public int getTong_gia() {
        return tong_gia;
    }

    public void setTong_gia(int tong_gia) {
        this.tong_gia = tong_gia;
    }

    public String getNoi_nhan() {
        return noi_nhan;
    }

    public void setNoi_nhan(String noi_nhan) {
        this.noi_nhan = noi_nhan;
    }

    public String getGhi_chu() {
        return ghi_chu;
    }

    public void setGhi_chu(String ghi_chu) {
        this.ghi_chu = ghi_chu;
    }

}
