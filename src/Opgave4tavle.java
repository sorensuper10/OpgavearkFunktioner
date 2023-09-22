import java.util.Scanner;

public class Opgave4tavle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h;
        double g;
        double a;
        System.out.println("Indtast grundlinje og højde");
        g = input.nextDouble();
        h = input.nextDouble();
        a = araelTrekant(h,g);
        System.out.println("Arealet er " + a);
    }

    public static double araelTrekant(double h, double g) {
        double areal = h * 0.5 * g;
        return areal;
    }
}
