package mart27.ogrenciYonetim;
/*
ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.

1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
	-AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF  BİLGİLERİNİ İÇERMELİDİR.

2. ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ

	SEÇİMİNİZ:

  ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.

3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
 */

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Ogrenci> ogrList=new ArrayList();
        Ogrenci ogrenci1=new Ogrenci("Abdullah","Bozca","1111",34,55,1);
        ogrList.add(ogrenci1);
        Ogrenci ogrenci2=new Ogrenci("Abdullah","Bozca","2222",32,55,1);
        ogrList.add(ogrenci2);
        Ogrenci ogrenci3=new Ogrenci("Abdullah","Bozca","3333",34,55,1);
        ogrList.add(ogrenci3);
        Islemler islemler=new Islemler();
        islemler.menu(ogrList);

    }


}
