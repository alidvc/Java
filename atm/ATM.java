

package com.mycompany.atm;

public class ATM {

    public static void main(String[] args) {
       Islemler atm = new Islemler();
       Hesap hesap = new Hesap("Ali Deveci","12345",2000);
       atm.calis(hesap);
       System.out.println("Programdan cıkılıyor...");
       
    }
}
