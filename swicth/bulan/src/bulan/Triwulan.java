/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bulan;

/**
 *
 * @author 404
 */
public class Triwulan {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Bulan = null;
        String triwulan = null;
        int nobulan = 3;
    
        
        
        
        switch (nobulan) {
        case 1 : Bulan = "January"; break;
        case 2 : Bulan = "Februaty"; break;
        case 3 : Bulan = "Maret"; break;
        case 4 : Bulan = "April"; break;
        case 5 : Bulan = "Mei"; break;
        case 6 : Bulan = "Juli"; break;
        case 8 : Bulan = "Aguastus"; break;
        case 9 : Bulan = "September"; break;
        case 10 : Bulan = "Oktober"; break;
        case 11 : Bulan = "November"; break;
        case 12 : Bulan = "Desember"; break;
        default: {
        System.out.println("Tidak ada bulan ke-" + nobulan);
        System.exit(1);  
                                }
        }
switch (nobulan){
    case 1:
    case 2:
    case 3:
    case 4:{
    triwulan = "I";
    break;
}
case 5:
    case 6:
    case 7:
    case 8:{
    triwulan = "II";
    break;

}case 9:
    case 10:
    case 11:
    case 12:{
    triwulan = "III";
    break;
    }
    default: {
   System.out.println("Tidak ada bulan ke-" + nobulan);
    }
   System.out.println("Bulan ke-"+ nobulan +" ("+Bulan+")masuk ke dalam triulan"+ triwulan);   
}
    }
}


