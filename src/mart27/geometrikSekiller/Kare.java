package mart27.geometrikSekiller;

import java.util.Scanner;

public class Kare implements Iislemler {
    Scanner scan = new Scanner(System.in);

    @Override
    public void alan() {
        System.out.println("karenin kenar uzunluğunu giriniz: ");
        int kenar = scan.nextInt();
        System.out.println("Karenin alanın: " + (kenar * kenar));
    }

    @Override
    public void cevre() {
        System.out.println("karenin kenar uzunluğunu giriniz: ");
        int kenar = scan.nextInt();
        System.out.println("Karenin çevresi: " + (kenar *4));
    }
}
