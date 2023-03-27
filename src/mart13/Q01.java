package mart13;

import java.util.Scanner;

public class Q01 {
    /*
    MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.

    Mountain array ==> [0,2,5,3,1]

    Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.

    Mountain array değildir ==>[5,2,7,1,4]

     */
    public static void main(String[] args) {
        System.out.print("Mountain array kontrolu için sayıları aralarına virgül koyarak giriniz: ");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String strArr[]=str.split(",");
        int arr[]=new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i]=Integer.parseInt(strArr[i]);
        }
        mountainArrControl(arr);
    }

    private static void mountainArrControl(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            System.out.println(i);
        }
    }
}
