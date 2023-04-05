package nisan03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenIslemleri implements Iislemler {
    /*
    Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ

	SEÇİMİNİZ:
     */
    Scanner scan = new Scanner(System.in);
    List<Ogretmen> ogretmenList = new ArrayList<>();

    void ogretmenMenu() {
        System.out.println("============= ÖĞRETMEN İŞLEMLERİ =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ekleme();
            }
            case '2': {
                arama();
            }
            case '3': {
                listeleme();
            }
            case '4': {
                silme();
            }
            case 'Q': {
                cikis();
            }
            default:{
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                ogretmenMenu();
            }
        }

    }

    @Override
    public void ekleme() {
        scan.nextLine();
        System.out.print("ÖĞRETMENİN ADINI GİRİNİZ: ");
        String ad = scan.nextLine();
        System.out.print("ÖĞRETMENİN SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.print("TC NO GİRİNİZ: ");
        String tcNo = scan.next();
        System.out.print("YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.print("BÖLÜMÜ GİRİNİZ: ");
        String bolum = scan.nextLine();
        System.out.print("SİCİL NO GİRİNİZ: ");
        int sicilNo = scan.nextInt();
        Ogretmen ogretmen = new Ogretmen(ad, sAd, tcNo, yas, bolum, sicilNo);
        ogretmenList.add(ogretmen);
        listeleme();
    }

    @Override
    public void arama() {
        System.out.print("ARANACAK KİŞİNİN TC NO SUNU GİRİNİZ: ");
        String aranacakTcNo = scan.next();
        int flag = 0;
        for (Ogretmen each : ogretmenList) {
            if (aranacakTcNo.equals(each.getTcNo())) {
                System.out.println(each);
                flag = 1;
                ogretmenMenu();
            }
        }
        if (flag == 0) {
            System.out.println("ARANAN KİŞİ BULUNAMADI");
            ogretmenMenu();
        }
    }

    @Override
    public void listeleme() {
        for (Ogretmen each : ogretmenList) {
            System.out.println(each);
        }
        ogretmenMenu();
    }

    @Override
    public void silme() {
        System.out.println("SİLİNECEK TC NO YU GİRİNİZ: ");
        String silinecekTcNo = scan.next();
        int flag = 0;
        for (int i = 0; i < ogretmenList.size(); i++) {
            if (silinecekTcNo.equals(ogretmenList.get(i).getTcNo())) {
                ogretmenList.remove(i);
                flag = 1;
                listeleme();
            }
        }
        if (flag == 0) {
            System.out.println("SİLİNECEK KİŞİ BULUNAMADI");
            ogretmenMenu();
        }

    }

    @Override
    public void cikis() {
        Anamenu anamenu=new Anamenu();
        anamenu.menu();
    }
}
