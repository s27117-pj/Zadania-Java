import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("prosze podac tekst ");
        String a = input.nextLine();
        System.out.print("prosze podac drugi tekst ");
        String b = input.nextLine();
        System.out.print("%"+a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print("%");
    }
}