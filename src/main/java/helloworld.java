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

public class helloworld {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int hasil_bagi;
        
        System.out.println("Masukkan Angka : ");
        int i = input.nextInt();
        
        if(i % 3 == 0 && i % 5 == 0)
        {
            System.out.println("Hello World");
        }
        else if(i % 3 == 0)
        {
            System.out.println("Hello");
        }
        else if(i % 5 == 0)
        {
            System.out.println("World");
        }       
    }
}
