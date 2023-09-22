import java.util.Scanner;

public class Opgave5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l;
        double b;
        double a;
        System.out.println("Indtast længde og bredde");
        l = input.nextDouble();
        b = input.nextDouble();
        a = arealRektangel(l,b);
        System.out.println("Arealet er " + a);

        // Her indtaster jeg ikke tallene selv
        //System.out.println(arealRektangel(5,5));
    }

    public static double arealRektangel (double l, double b) {
        double areal = l * b;
        return areal;
    }
}
