import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayı = input.nextInt();

        int sayac = 0;
        if (sayı > 0) {
            for(int i = 1; i <= sayı; ++i) {
                if (sayı % i == 0) {
                    ++sayac;
                }
            }

            System.out.println("Girilen sayı: " + sayı);
            if (sayac == 2) {
                System.out.println("Girilen sayı asaldır.");
            } else {
                System.out.println("Girilen sayı asal değildir.");
            }
        } else {
            System.out.println("Lütfen pozitif bir tam sayı giriniz.");
        }

    }
}