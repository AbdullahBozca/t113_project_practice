package mart27.geometrikSekiller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hesap yapmak istediğiniz geometrik şekli seçiniz: \n" +
                "1. kare\n" +
                "2. dikdörtgen");
        Scanner scanner=new Scanner(System.in);
        int secim=scanner.nextInt();
        if (secim==1){
            Kare kare=new Kare();
            kare.alan();
            kare.cevre();
        } else if (secim==2) {
            Dikdortgen dikdortgen=new Dikdortgen();
            dikdortgen.alan();
            dikdortgen.cevre();
        }
    }
}
