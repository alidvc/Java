 
package com.mycompany.atm;

import java.util.Scanner;


public class Login {
    
    public  boolean login(Hesap hesap){
        Scanner input = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.println("Kullanıcı adınızı giriniz: ");
        kullanici_adi = input.nextLine();
        System.out.println("Parolayı giriniz: ");
        parola = input.nextLine();
        
        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola))
            return true;
        else
            return false;
               
    }
}
