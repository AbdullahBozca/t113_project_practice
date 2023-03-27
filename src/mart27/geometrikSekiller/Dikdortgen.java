package mart27.geometrikSekiller;

import java.util.Scanner;

public class Dikdortgen implements Iislemler{
    Scanner scanner=new Scanner(System.in);
    @Override
    public void alan() {
        System.out.print("Kısa kenarı giriniz: ");
        int kenar1=scanner.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int kenar2=scanner.nextInt();
        System.out.println("Dikdörtgenin alanı: " +(kenar2*kenar1));
    }

    @Override
    public void cevre() {
        System.out.print("Kısa kenarı giriniz: ");
        int kenar1=scanner.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int kenar2=scanner.nextInt();
        System.out.println("Dikdörtgenin çevresi: " +(2*(kenar2+kenar1)));

    }
}
