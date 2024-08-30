/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class danhmuc_sp{
    int id_dm ;
String ten_danhmuc;

public danhmuc_sp(){
    
}

    public danhmuc_sp(int id_dm, String ten_danhmuc) {
        this.id_dm = id_dm;
        this.ten_danhmuc = ten_danhmuc;
    }

    public int getId_dm() {
        return id_dm;
    }

    public void setId_dm(int id_dm) {
        this.id_dm = id_dm;
    }

    public String getTen_danhmuc() {
        return ten_danhmuc;
    }

    public void setTen_danhmuc(String ten_danhmuc) {
        this.ten_danhmuc = ten_danhmuc;
    }
    

}
    
    
    



