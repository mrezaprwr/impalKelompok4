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
public class kamarCoba {
    private int status_kamar;
    private String id_kamar, tipe_kamar, kode_receptionist;
    private double tarif;
    public kamarCoba(){
        
    }
    
    public kamarCoba(String id_kamar, String tipe_kamar, int status_kamar){
        this.id_kamar = id_kamar;
        this.tipe_kamar = tipe_kamar;
        this.status_kamar = status_kamar;
    }
    
    public int getStatusKamar(){
        return status_kamar;
    }
    public String getIdKamar(){
        return id_kamar;
    }
    public String getTipeKamar(){
        return tipe_kamar;
    }
    public double getTarif(){
        switch (tipe_kamar) {
            case "standard":
                return 250000;
            case "deluxe":
                return 500000;
            case "vip":
                return 900000;
            default:
                return 0;
        }
    }
    public String getKodeReceptionist(){
        return kode_receptionist;
    }
    public void setIdKamar(String id_kamar){
        this.id_kamar = id_kamar;
    }
    public void setTipeKamar(String tipe_kamar){
        this.tipe_kamar = tipe_kamar;
    }
    public void setStatusKamar(int status_kamar){
        this.status_kamar = status_kamar;
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
