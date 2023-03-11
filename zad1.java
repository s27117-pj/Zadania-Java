import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Prosze podac pierwszy bok ");
        double a = input.nextDouble();
        System.out.print("Prosze podac drugi bok ");
        double b = input.nextDouble();
        double c = a*b;
        System.out.println("Pole prostokąta wynosi " +c);
    }
}