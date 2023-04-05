package nisan03;

import java.util.Scanner;

public class Anamenu {
    /*
    2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için aşağıdaki gibi bir menü gösterilsin.

	====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	 1- ÖĞRENCİ İŞLEMLERİ
	 2- ÖĞRETMEN İŞLEMLERİ
	 Q- ÇIKIŞ

     */
    void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n" +
                "\t SEÇİMİNİZ: ");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
                ogrenciIslemleri.ogrenciMenu();
            }
            case '2': {
                OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
                ogretmenIslemleri.ogretmenMenu();
            }
            case 'Q': {
                System.exit(0);
            }
            default:{
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                menu();
            }
        }

    }
}
