package mart27.ogrenciYonetim;

import java.util.List;
import java.util.Scanner;

public class Islemler {
    Scanner scan = new Scanner(System.in);
    Ogrenci ogrenci;
    int numara = 1000;

    void menu(List<Ogrenci> ogrList) {
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-LİSTELEME\n" +
                "\t\t 3-ARAMA\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ: ");
        char secim = scan.next().toUpperCase().charAt(0);

        switch (secim) {
            case '1': {
                ekleme(ogrList);
            }
            case '2': {
                listele(ogrList);
            }
            case '3': {
                arama(ogrList);
            }
            case '4': {
                silme(ogrList);
            }
            case 'Q': {
                System.exit(0);
            }
            default:{
                System.out.println("YANLIŞ DEĞER GİRDİNİZ: ");
                menu(ogrList);
            }
        }
    }

    private void silme(List<Ogrenci> ogrList) {
        int flag=0;
        System.out.print("SİLİNECEK TC NO YU GİRİNİZ: ");
        String silinecekTcNo=scan.next();
        for (int i = 0; i < ogrList.size(); i++) {
            if (silinecekTcNo.equals(ogrList.get(i).getTcNo())){
                ogrList.remove(i);
                flag=1;
                listele(ogrList);
            }
        }
        if (flag==0){
            System.out.println("ARADIĞINIZ TC NO YA AİT ÖĞRENCİ YOKTUR..");
            menu(ogrList);
        }
        menu(ogrList);
    }

    private void arama(List<Ogrenci> ogrList) {
        int flag = 0;
        System.out.print("ARAMA YAPILACAK TC NO: ");
        String aranacakTcNo = scan.next();
        for (Ogrenci each : ogrList) {
            if (aranacakTcNo.equals(each.getTcNo())) {
                System.out.println("ARADIĞINIZ ÖĞRENCİNİN BİLGİLERİ\n" + each);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("ARADIĞINIZ TC NO YA AİT ÖĞRENCİ YOKTUR..");
            menu(ogrList);
        }
        menu(ogrList);
    }

    private void listele(List<Ogrenci> ogrList) {
        for (Ogrenci each : ogrList) {
            System.out.println(each);
        }
        menu(ogrList);
    }

    private void ekleme(List<Ogrenci> ogrList) {
        scan.nextLine();
        System.out.print("ÖĞRENCİNİN ADINI GİRİNİZ: ");
        String ad = scan.nextLine();
        System.out.print("ÖĞRENCİNİN SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.print("ÖĞRENCİNİN TC NO SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        System.out.print("ÖĞRENCİNİN YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        System.out.print("ÖĞRENCİNİN SINIFINI GİRİNİZ: ");
        int sinif = scan.nextInt();
        ogrenci = new Ogrenci(ad, sAd, tcNo, yas, numara++, sinif);
        ogrList.add(ogrenci);
        listele(ogrList);
    }
}
