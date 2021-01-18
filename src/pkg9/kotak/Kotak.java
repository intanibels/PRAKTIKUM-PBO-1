/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.kotak;
/**
 *
 * @author Intan
 */
public class Kotak {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){ //melakukan perulangan kebawah sebanyak 4 kali
            for(int j=1; j<=4; j++){ //melakukan perulangan kesamping sebanyak 4 kali
                if(i==1 || i==4 || j==1 || j==4){ //percabangan jika i dan j = 1, dan i dan j = 4
                    System.out.print("@"); //output yang ditampilkan adalah @
                }else{ //jika selain syarat
                    System.out.print(" "); //output yang ditampilkan adalah spasi
                }
            }System.out.println(""); //memberi jarak antar baris
        }
    }   
}
