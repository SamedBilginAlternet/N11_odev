import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;

        // Dairenin Alanı ve Çevresi
        System.out.print("Dairenin yarıçapını giriniz: ");
        double r = scanner.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        // Daire Dilimi Alanı
        System.out.print("Merkez açısını giriniz (derece): ");
        double alfa = scanner.nextDouble();

        double dilimAlani = (pi * r * r * alfa) / 360;

        System.out.println("Daire Diliminin Alanı: " + dilimAlani);

        scanner.close();
    }
}
