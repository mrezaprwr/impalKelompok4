/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservasi;

/**
 *
 * @author Buala
 */
public class Pesanan {
    private String id_kamar, email;
    private int id_pesanan, lama_nginap;
    public Pesanan(int id_pesanan, String id_kamar, String email, int lama_nginap){
        this.id_pesanan = id_pesanan;
        this.id_kamar = id_kamar;
        this.email = email;
        this.lama_nginap = lama_nginap;
    }
    
    public int getIdPesanan(){
        return id_pesanan;
    }
    public String getIdKamar(){
        return id_kamar;
    }
    public String getEmail(){
        return email;
    }
    public int getLamaNginap(){
        return lama_nginap;
    }
}
