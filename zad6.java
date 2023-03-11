import java.util.Scanner;

class SortowanieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj trzy liczby rzeczywiste:");
        double liczba1 = scanner.nextDouble();
        double liczba2 = scanner.nextDouble();
        double liczba3 = scanner.nextDouble();
        double min, srodkowa, max;
        if (liczba1 <= liczba2 && liczba1 <= liczba3) {
            min = liczba1;
            if (liczba2 <= liczba3) {
                srodkowa = liczba2;
                max = liczba3;
            } else {
                srodkowa = liczba3;
                max = liczba2;
            }
        } else if (liczba2 <= liczba1 && liczba2 <= liczba3) {
            min = liczba2;
            if (liczba1 <= liczba3) {
                srodkowa = liczba1;
                max = liczba3;
            } else {
                srodkowa = liczba3;
                max = liczba1;
            }
        } else {
            min = liczba3;
            if (liczba1 <= liczba2) {
                srodkowa = liczba1;
                max = liczba2;
            } else {
                srodkowa = liczba2;
                max = liczba1;
            }
        }
        System.out.println("Liczby w kolejności od najmniejszej do największej: " + min + ", " + srodkowa + ", " + max);
        if (liczba1 >= liczba2 && liczba1 >= liczba3) {
            max = liczba1;
            if (liczba2 >= liczba3) {
                srodkowa = liczba2;
                min = liczba3;
            } else {
                srodkowa = liczba3;
                min = liczba2;
            }
        } else if (liczba2 >= liczba1 && liczba2 >= liczba3) {
            max = liczba2;
            if (liczba1 >= liczba3) {
                srodkowa = liczba1;
                min = liczba3;
            } else {
                srodkowa = liczba3;
                min = liczba1;
            }
        } else {
            max = liczba3;
            if (liczba1 >= liczba2) {
                srodkowa = liczba1;
                min = liczba2;
            } else {
                srodkowa = liczba2;
                min = liczba1;
            }
        }
        System.out.println("Liczby w kolejności od największej do najmniejszej: " + max + ", " + srodkowa + ", " + min);

        scanner.close();
    }
}