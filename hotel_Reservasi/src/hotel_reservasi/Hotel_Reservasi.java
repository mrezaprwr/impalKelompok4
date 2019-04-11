/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservasi;

import java.text.ParseException;

/**
 *
 * @author Reza Siahaan
 */
public class Hotel_Reservasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        //String email = TextEmail.getText();
        kamarCoba k = new kamarCoba("D02","deluxe",0);
        pesananCoba coba = new pesananCoba(1, "01/14/2012", "01/24/2012" , "rsiahaan4");
        
        /*coba.setCheckIn("01/14/2012");
        coba.setCheckOut("01/20/2012");*/
        System.out.println(coba.getLamaNginap());
        System.out.println(coba.totalHarga());
    }
}
