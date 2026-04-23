import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz (TL): ");
        double fiyat = scanner.nextDouble();

        double kdvOrani;
        if (fiyat >= 0 && fiyat <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat + " TL");
        System.out.println("KDV Oranı: %" + (int)(kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");

        scanner.close();
    }
}
