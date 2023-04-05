package nisan03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemleri implements Iislemler {/*
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

    List<Ogrenci> ogrenciList = new ArrayList<>();
    int numara = 1000;

    void ogrenciMenu() {
        System.out.println("=============ÖĞRENCİ İŞLEMLER =============\n" +
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
                ogrenciMenu();
            }
        }
    }


    @Override
    public void ekleme() {
        System.out.print("ÖĞRENCİNİN ADINI GİRİNİZ: ");
        scan.nextLine();
        String ad = scan.nextLine();
        System.out.print("ÖĞRECİNİN SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.print("ÖĞRENCİNİN TC NOSUNU GİRİNİZ: ");
        String tcNo = scan.next();
        System.out.print("ÖĞRECİNİN YASINI GİRİNİZ: ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.print("ÖĞRENCİNİN SINIFINI GİRİNİZ: ");
        int sinif = scan.nextInt();
        Ogrenci ogrenci = new Ogrenci(ad, sAd, tcNo, yas, numara++, sinif);
        ogrenciList.add(ogrenci);
        listeleme();
        ogrenciMenu();

    }

    @Override
    public void arama() {
        System.out.print("ARANACAK KİŞİNİN TC NOSUNU GİRİNİZ: ");
        String tcNo = scan.next();
        int flag = 0;
        for (Ogrenci each : ogrenciList) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println("ARANAN KİŞİ: " + each);
                flag = 1;
                ogrenciMenu();
            }
        }
        if (flag == 0) {
            System.out.println(tcNo + " TC NOLU KİŞİ YOKTUR");
            ogrenciMenu();
        }

    }

    @Override
    public void listeleme() {
        for (Ogrenci each : ogrenciList) {
            System.out.println(each);
        }
        ogrenciMenu();
    }

    @Override
    public void silme() {
        System.out.print("SİLİNECEK KİŞİNİN TC NO SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        boolean flag = true;

        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNo().equals(tcNo)) {
                System.out.println("SİLİNECEK KİŞİ: " + ogrenciList.get(i));
                ogrenciList.remove(i);
                flag = false;
                listeleme();
            }
        }
        if (flag) {
            System.out.println(tcNo + " TC NOLU KİŞİ YOKTUR");
            ogrenciMenu();
        }


    }

    @Override
    public void cikis() {
        Anamenu anamenu=new Anamenu();
        anamenu.menu();
    }
}
