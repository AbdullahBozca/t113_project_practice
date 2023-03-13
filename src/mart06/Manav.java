package mart06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav {
    /*
    Basit bir 5 ürünlü manav alisveris programi yaziniz.

      1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
      2. Adim : Baska bir urun almak isteyip istemedigini sor.
                 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
      3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
      4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

     */
    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("1. Domates", "2. Soğan", "3. Portakal", "4. Elma", "5. Kivi"));
    static ArrayList<Integer> fiyatListesi = new ArrayList<>(Arrays.asList(15, 18, 13, 10, 17));

    static int tutar;

    public static void main(String[] args) {
        System.out.println("******YILDIZ MANAV******");
        urunsec();
    }

    private static void urunsec() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ÜRÜN SEÇİNİZ:");

        for (String x : urunListesi) { //static olan metodlarda dışarıdan alınan değişkenler de static olmak zorunda
            System.out.println(x);
        }
        System.out.print("SEÇİMİZ: ");
        int secim = scan.nextInt();

        System.out.println("KAÇ KG ÜRÜN ALACAKSINIZ: ");
        int miktar = scan.nextInt();

        tutar += miktar * fiyatListesi.get(secim-1);
        System.out.println("ALIŞVERİŞE DEVAM ETMEK İSTİYOR MUSUNUZ?(E/H)");
        char cikis=scan.next().toUpperCase().charAt(0);
        if (cikis =='H'){
            System.out.println("ÖDENECEK TUTAR: "+tutar+" TL");
            System.exit(0);
        }else {
            urunsec();
        }

    }
}
