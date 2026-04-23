import java.util.Scanner;

public class UcgenHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hipotenüs Hesaplama
        System.out.println("=== Dik Üçgende Hipotenüs Hesaplama ===");
        System.out.print("Birinci dik kenar uzunluğunu giriniz: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci dik kenar uzunluğunu giriniz: ");
        double b = scanner.nextDouble();

        double hipotenus = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs: " + hipotenus);

        // Üçgen Alan Hesaplama (Heron Formülü)
        System.out.println("\n=== Üçgen Alan Hesaplama (Heron Formülü) ===");
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        double kenarA = scanner.nextDouble();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        double kenarB = scanner.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        double kenarC = scanner.nextDouble();

        double u = (kenarA + kenarB + kenarC) / 2;
        double alan = Math.sqrt(u * (u - kenarA) * (u - kenarB) * (u - kenarC));

        System.out.println("Yarı Çevre (u): " + u);
        System.out.println("Üçgenin Alanı: " + alan);

        scanner.close();
    }
}
