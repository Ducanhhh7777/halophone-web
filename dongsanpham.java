/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class dongsanpham {
   int  id_cacloai;
  String ten_dong; 
  int id_dm;
  String anh_cacdong;
  
  public dongsanpham(int aInt, String string, int aInt1){
      
  }

    public dongsanpham(int id_cacloai, String ten_dong, int id_dm, String anh_cacdong) {
        this.id_cacloai = id_cacloai;
        this.ten_dong = ten_dong;
        this.id_dm = id_dm;
        this.anh_cacdong = anh_cacdong;
    }

    public int getId_cacloai() {
        return id_cacloai;
    }

    public void setId_cacloai(int id_cacloai) {
        this.id_cacloai = id_cacloai;
    }

    public String getTen_dong() {
        return ten_dong;
    }

    public void setTen_dong(String ten_dong) {
        this.ten_dong = ten_dong;
    }

    public int getId_dm() {
        return id_dm;
    }

    public void setId_dm(int id_dm) {
        this.id_dm = id_dm;
    }

    public String getAnh_cacdong() {
        return anh_cacdong;
    }

    public void setAnh_cacdong(String anh_cacdong) {
        this.anh_cacdong = anh_cacdong;
    }

    
}
