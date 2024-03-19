
package com.mycompany.atm;

import java.util.Scanner;

public class Islemler {
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldizin...");
        System.out.println("************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("************************"); 
        int giris_hakkı = 3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş başarılı...");
                break;
            }
            else{
                System.out.println("Giriş başarısız...");
                giris_hakkı--;
                System.out.println("Kalan giriş hakkı "+giris_hakkı);
            }
            if(giris_hakkı == 0){
                System.out.println("Giriş hakkınız bitti...");
                return ;
            }
        }
        System.out.println("*************************");
        String islemler = "1.Bakiye Görüntüle\n"
                +"2.Para Yatırma\n"
                +"3.Para Çekme\n"
                +"Çıkış için q ya basın";
        System.out.println(islemler);
        System.out.println("*************************");
        
        while(true){
            System.out.println("İşlemi seçiniz: ");
            String islem = input.nextLine();
            if(islem.equals("q"))
                break;
            
            else if(islem.equals("1"))
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            else if (islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar  =input.nextInt();
                input.nextLine();
                hesap.para_yatır(tutar);
            } 
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.para_cek(tutar);             
            }
            else
                System.out.println("Geçersiz İşlem!!!");
                
            
                
        }
        
    }
}
