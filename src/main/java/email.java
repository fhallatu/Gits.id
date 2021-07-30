/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fhall
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class email {
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      
      String email, hasil = "";
        
            System.out.println("Masukkan Email : ");
            email = input.nextLine();
            
      String EMAIL_REGEX = "^[\\w-_\\.+]{1,20}\\@\\.([\\w]+\\.)+(([co]+\\.[id])||(id))$";

      Boolean b = email.matches(EMAIL_REGEX);
      System.out.println("e-mail: "+email+" : " + b);
   }
}
