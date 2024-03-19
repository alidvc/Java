

package com.mycompany.calisanprogrami;

import java.util.Scanner;

public class CalisanProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        String islemler = "İşlemler...\n"
                +"1.Yazılımcı işlemleri\n"
                +"2.Yönetici işlemleri\n"
                +"Çıkış için q ya basın";
        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");
        
        while(true){
            System.out.print("İşlemi seçiniz: ");
            String islem = input.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Ali","Deveci",521337,"Python,C,Java");
                String yazilimci_islem = "1.Format at\n"
                        +"2.Bilgileri göster\n"
                        +"Çıkış için q ya basın";
                System.out.println(yazilimci_islem);       
                while(true){
                    System.out.println("İşlemi seçiniz: ");
                    String y_islem = input.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("Yazilimci işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("İşletim sistemi: ");
                        String isletim_sis = input.nextLine();
                        yazilimci.FormatAt(isletim_sis);
                    }
                    else if(y_islem.equals("2"))
                        yazilimci.BilgileriGoster();
                    
                    else
                        System.out.println("Geçersiz yazilimci işlemi!!!");
                    
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Kadir","Mısıroğlu",154711,40);
                String yonetici_islem = "Yonetici işlemleri...\n"
                        +"1.Zam yap\n"
                        +"2.Bilgileri göster\n"
                        +"Çıkış için q ya basın";
                System.out.println(yonetici_islem);
                while (true) {                    
                    System.out.println("İşlem seçiniz: ");
                    String y_islem = input.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zam_miktarı = input.nextInt();
                        input.nextLine();
                        yonetici.ZamYap(zam_miktarı);
                    }
                    else if(y_islem.equals("2"))
                        yonetici.BilgileriGoster();
                    
                    else
                        System.out.println("Geçersiz seçim!!!");
                }
            }
            else
                System.out.println("Geçersiz seçim!!!");
        }
        
    }
}
