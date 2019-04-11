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
public class kamar {
    private int status_ruangan;
    private String id_kamar, tipe_kamar, tarif, kode_receptionist;
    
    public kamar(String id_kamar, String tipe_kamar, String tarif, int status_ruangan){
        this.id_kamar = id_kamar;
        this.tipe_kamar = tipe_kamar;
        this.tarif = tarif;
        this.status_ruangan = status_ruangan;
        this.kode_receptionist = kode_receptionist;
    }
    
    public int getStatusRuangan(){
        return status_ruangan;
    }
    public String getIdKamar(){
        return id_kamar;
    }
    public String getTipeKamar(){
        return tipe_kamar;
    }
    public String getTarif(){
        return tarif;
    }
    public String getKodeReceptionist(){
        return kode_receptionist;
    }
    /*
    public double tarifKamar(String tipeKamar){
        if(tipeKamar.equals('standard')){
            return 250000;
        }
        else if(tipe_kamar=='deluxe'){
            return 500000;
        }
        else if(tipe_kamar=='VIP'){
            return 950000;
        }
        */
}
