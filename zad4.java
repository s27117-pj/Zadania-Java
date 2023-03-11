import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trojkata ");
        double a = input.nextDouble();
        if (a<0){
            System.out.println("Podano bledne wartosci ");
            System.exit(0);}
        System.out.println("Podaj drugi bok trojkata ");
        double b = input.nextDouble();
        if (b<0){
            System.out.println("Podano bledne wartosci ");
            System.exit(0);}
        System.out.println("Podaj drugi bok trojkata ");
        double c = input.nextDouble();
        if (c<0){
            System.out.println("Podano bledne wartosci ");
            System.exit(0);}
        if (a+b<=c){
            System.out.println("Nie da sie zbudowac trojkata");
        }
    else if (a+c<=b){
            System.out.println("Nie da sie zbudowac trojkata");
        }
    else if (b+c<=a){
            System.out.println("Nie da sie zbudowac trojkata");
        }
    else
            System.out.println("Mozna zbudowac trojkat");
    }

}