/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservasi;

/**
 *
 * @author Reza Siahaan
 */
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class pesananCoba {
    private String id_kamar, email;
    private int id_pesanan;
    
    //private int lama_nginap;
    private String checkIn, checkOut;
    //private Date checkIn, checkOut;
    kamarCoba Kamar;
    public pesananCoba(){
        
    }
    
    public pesananCoba(int id_pesanan, String checkIn, String checkOut, String email){
        this.id_pesanan = id_pesanan;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        //this.lama_nginap = lama_nginap;
        //this.id_kamar = Kamar.getIdKamar();
        this.email = email;
    }
    
    public int getIdPesanan(){
        return id_pesanan;
    }
    public String getCheckIn(){
        return checkIn;
    }
    public String getCheckOut(){
        return checkOut;
    }
    
    public long getLamaNginap() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        //Date d1 = null;
        //Date d2 = null;
        
        Date d1 = format.parse(checkIn);
        Date d2 = format.parse(checkOut);
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
        /*try {
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
    }
    
    public String getIdKamar(){
        return id_kamar;
    }
    public String getEmail(){
        return email;
    }
    public void setIdPesanan(int id_pesanan){
        this.id_pesanan = id_pesanan;
    }
    public void setCheckIn(String checkIn){
        this.checkIn = checkIn;
    }
    public void setCheckOut(String checkOut){
        this.checkOut = checkOut;
    }
    public void setIdKamar(String id_kamar){
        this.id_kamar = id_kamar;
    }
    public void setEmail(String email){
        this.email = email;
    }
  
    public double totalHarga() throws ParseException{
	double pajak = 0.1;
	return Kamar.getTarif()*(1 + pajak);
    }
}
