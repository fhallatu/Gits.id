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

public class cek_kalimat {
        public static void main(String[] args){
	
            Scanner input = new Scanner(System.in);
        
            String k, hasil = "";
        
            System.out.println("Masukkan Kata atau Kalimat : ");
            k = input.nextLine();	
            
						
		for(int i = k.length()-1; i>-1; i--){
			char c = k.charAt(i);			
			hasil += String.valueOf(c);
		}
		
		if(k.equals(hasil)){
			System.out.println( " True ( Karena Palindrome )" );
		}else{
			System.out.println( " False ( Karena Bukan Palindrome ) ");
		}
	}
}
