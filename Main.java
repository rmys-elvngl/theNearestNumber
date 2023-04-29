package star;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, 778, 2, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Diziyi sıralama
        Arrays.sort(dizi);

        // En yakın sayıları bulma
        int en_kucuk = -1;
        int en_buyuk = -1;
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            if (eleman < sayi) {
                en_kucuk = eleman;
            } else if (eleman > sayi) {
                en_buyuk = eleman;
                break;
            }
        }

        // Sonuçları yazdırma
        System.out.println("Girilen sayı: " + sayi);
        if (en_kucuk == -1) {
            System.out.println("Girilen sayıdan küçük bir sayı yok.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + en_kucuk);
        }
        if (en_buyuk == -1) {
            System.out.println("Girilen sayıdan büyük bir sayı yok.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + en_buyuk);
        }
    }
}
