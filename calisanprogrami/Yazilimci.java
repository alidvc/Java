
package com.mycompany.calisanprogrami;

public class Yazilimci extends Calisan{
    private String diller;
 
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void FormatAt(String isletim_sistemi){
        System.out.println(getAd()+" "+isletim_sistemi+"'ni yüklüyor...");
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Yazılımcının bildiği diller "+diller);
        
    }
    
}
