import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {

        // Her indtaster jeg selv alle talene

        Scanner input = new Scanner(System.in);

        /*System.out.println("Indtast 3 tal");

        double area;
        double height;
        double grundlinje;
        height = input.nextDouble();
        grundlinje = input.nextDouble();
        area = input.nextDouble();
        System.out.println("Arealet er " + arealTrekant(area,height,grundlinje));*/

        // Her indtaster jeg kun højde og grundlinje
        /*System.out.println("Indtast 2 tal");
        double area;
        double height;
        double grundlinje;
        height = input.nextDouble();
        grundlinje = input.nextDouble();
        area = arealTrekant1(height,grundlinje);
        System.out.println("Arealet er " + area);*/

        // Her indtaster jeg ikke nogle tal
        /*double area = 0.5;
        int grundlinje = 5;
        int height = 5;
        System.out.println("Arealet er " + area * height * grundlinje);
        System.out.println(arealTrekant(0.5,5,5));
        System.out.printf("arealet er %.2f ",arealTrekant(0.5,10,5)); */

    }

    public static double arealTrekant(double area, double height, double grundlinje) {
        double areal = area * height * grundlinje;
        return areal;
    }

    public static double arealTrekant1(double height, double grundlinje) {
        double areal = 0.5 * height * grundlinje;
        return areal;
    }
}
