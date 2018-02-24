/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nilai_huruf;

/**
 *
 * @author 404
 */
public class konversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char nindex;
        double na,nuts,nuas,ntug,nex;
        nuts=76;
        nuas=66;
        ntug=80;
        nex=75;
        
    na= (0.5*nuas)+(0.4*nuts)+(0.05*ntug)+(0.05*nex);
        
        if (na >= 80) {
        
        nindex ='A';
        }else if (na >= 70) {
            nindex ='B';
        }else if (na >= 50) {
            nindex ='C';
        }else if (na >= 30) {
            nindex ='D';
        }else {
        nindex='E';}
System.out.println("nilai\t: : " + na);
System.out.println("nilai\t: : " + nindex);
    }}
    
    
    
    

    
