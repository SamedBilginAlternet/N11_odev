import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi giriniz (KM): ");
        double mesafe = scanner.nextDouble();

        double acilisUcreti = 10;
        double kmBasiUcret = 2.20;

        double tutar = acilisUcreti + (mesafe * kmBasiUcret);

        if (tutar < 20) {
            tutar = 20;
        }

        System.out.println("Taksimetre Tutarı: " + tutar + " TL");

        scanner.close();
    }
}
