import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        double matematik = scanner.nextDouble();

        System.out.print("Fizik notunu giriniz: ");
        double fizik = scanner.nextDouble();

        System.out.print("Kimya notunu giriniz: ");
        double kimya = scanner.nextDouble();

        System.out.print("Türkçe notunu giriniz: ");
        double turkce = scanner.nextDouble();

        System.out.print("Tarih notunu giriniz: ");
        double tarih = scanner.nextDouble();

        System.out.print("Müzik notunu giriniz: ");
        double muzik = scanner.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Not Ortalamanız: " + ortalama);

        String sonuc = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

        scanner.close();
    }
}
