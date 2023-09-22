import java.util.Scanner;

public class Opgave7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;

        System.out.println("Indtast de 2 kordinatsæt");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        double distance = afstand(x1,y1,x2,y2);
        System.out.println("afstanden melllem de 2 kordinatsæt er " + distance);

    }

    public static double afstand(double x1, double y1, double x2, double y2) {
        double afstand = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return afstand;
    }
}
