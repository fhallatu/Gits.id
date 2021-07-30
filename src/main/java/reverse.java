/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fhall
 */
import java.util.Scanner;

public class reverse {

    private static int i;
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        String k, hasil = "";
        
        System.out.println("Masukkan Kata : ");
        k = input.nextLine();
        
        for ( int i = k.length()-1 ; i >= 0 ; i-- )
        hasil = hasil + k.charAt(i);
        
        System.out.println("Hasil Kata Yang DIbalik : " +hasil);
    }
}
