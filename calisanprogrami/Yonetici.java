
package com.mycompany.calisanprogrami;

public class Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kisi sayısı: "+sorumlu_kisi_sayisi);
    }
    public void ZamYap(int zam_miktarı){
        System.out.println(getAd()+" Çalışanlara "+zam_miktarı+" kadar zam yapıyor...");
    }
}
