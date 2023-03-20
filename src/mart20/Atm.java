package mart20;

import java.io.*;
import java.util.Scanner;

public class Atm {
    /*
        ATM
    Kullanicidan giriş için kart numarasi ve şifresini isteyin,
    eger herhangi birini yanlis girerse tekrar isteyin.Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.


    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.

    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
         */

    static String kartNo = "123456";
    static String sifre = "1234";
    static double bakiye = 50000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        /*
        Kullanicidan giriş için kart numarasi ve şifresini isteyin,
    eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
         */
        System.out.print("KART NUMARASINI GİRİNİZ: ");
        String kKartNo = scan.nextLine().replace(" ", "");
        System.out.print("ŞİFRENİZİ GİRİNİZ: ");
        String kSifre = scan.next();

        if (kSifre.equals(sifre) && kKartNo.equals(kartNo)) {
            menu();
        } else {
            System.out.println("KULLANICI ADI VEYA ŞİFRE YANLIŞ GİRİLDİ...");
            scan.nextLine(); // dummy ----> ard arda scanner objesi kullanıldığında alınan hatayı engellemek amaçlı kullandık
            giris();
        }

    }

    private static void menu() {
        //Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
        System.out.print("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ:\n" +
                "1. BAKİYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA ÇEKME\n" +
                "4. PARA GÖNDERME\n" +
                "5. ŞİFRE DEĞİŞTİRME\n" +
                "6. ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        int secim = scan.nextInt();

        switch (secim) {
            case (1): {
                //BAKİYE SORGULAMA
                bakiyeSorgula();
            }
            case (2): {
                //PARA YATIRMA
                System.out.print("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);

            }
            case (3): {
                //PARA ÇEKME
                //Para çekme işleminde mevcut bakiyeden buyuk para çekilemez
                System.out.print("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scan.nextDouble();
                paraCekme(miktar);

            }
            case (4): {
                //PARA GÖNDERME
                /*
                para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
                Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
                 */
                paraGonderme();

            }
            case (5): {
                // Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
                sifreDegistir();
            }
            case (6): {
                System.out.println("GÜLE GÜLE...");
                System.exit(0);
            }
            default:{
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
            }
        }

    }

    private static void sifreDegistir() {
        System.out.print("ESKİ ŞİFRENİZİ GİRİNİZ: ");
        String eSifre = scan.next();
        if (eSifre.equals(sifre)) {
            System.out.print("YENİ ŞİFRE GİRİNİZ: ");
            sifre = scan.next();
            scan.nextLine();
            giris();
        } else {
            System.out.println("HATALI GİRİŞ YAPTINIZ...");
            sifreDegistir();
        }
    }

    private static void paraGonderme() {
        /*
                para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
                Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
                 */
        scan.nextLine();// dummy
        System.out.print("PARA GÖNDERMEK İSTEDİĞİNİZ İBAN NUMARASINI GİRİNİZ: ");
        String iban = scan.nextLine().toUpperCase().replace(" ", "");
        if (iban.length() == 26 && iban.startsWith("TR")) {
            System.out.print("GÖNDERMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
            double miktar = scan.nextDouble();
            if (miktar <= bakiye) {
                System.out.println(miktar + " TL " + iban + " NOLU HESABA GÖNDERİLDİ");
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("GÖNDERMEK İSTEDİĞİNİZ TUTARA SAHİP DEĞİLSİNİZ...");
                bakiyeSorgula();
            }
        }
    }

    private static void paraCekme(double miktar) {
        //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARA SAHİP DEĞİLSİNİZ...");
            bakiyeSorgula();

        }
    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("BAKİYENİZ: " + bakiye);
        menu();
    }

}
