/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class sp_ban {
    int id_spban;
    int id_sp;
    int soluong_ban;
    
    public sp_ban(){
        
    }

    public sp_ban(int id_spban, int id_sp, int soluong_ban) {
        this.id_spban = id_spban;
        this.id_sp = id_sp;
        this.soluong_ban = soluong_ban;
    }

    public int getId_spban() {
        return id_spban;
    }

    public void setId_spban(int id_spban) {
        this.id_spban = id_spban;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public int getSoluong_ban() {
        return soluong_ban;
    }

    public void setSoluong_ban(int soluong_ban) {
        this.soluong_ban = soluong_ban;
    }
    
    
}
