import static java.lang.Math.sqrt;

class MathFunctions {
    public static void main(String[] args) {
        System.out.println("Pierwiastek PI wynosi");
        double pi=3.141592653589793;
        double x;
        x=sqrt(pi);
        System.out.println(String.format("%.2f", x));
    }
}