package mart13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q03 {
    //Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
    //Örnek: 12 = 1 1 0 0

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Desimal değer giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(sayi + " desimal değerin binary karşılığı= " + binaryDonusum(sayi));
    }

    private static ArrayList<Integer> binaryDonusum(int sayi) {
        ArrayList<Integer> binary = new ArrayList<>();

        while (sayi >= 1) { // 12 = 1 1 0 0
            binary.add(sayi % 2);
            sayi /= 2; //sayi=sayi/2;
        }
        ArrayList<Integer> tersLst=new ArrayList<>();

        Collections.reverse(binary);
        for (int i = binary.size() - 1; i >= 0; i--) {
            tersLst.add(binary.get(i));
        }
        return binary;
    }
}
