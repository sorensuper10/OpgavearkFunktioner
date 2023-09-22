import java.util.Scanner;

public class Opgave6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l;
        double b;
        double o;
        System.out.println("Indtast længde og bredde");
        l = input.nextDouble();
        b = input.nextDouble();
        o = omkredsRektangel(l,b);
        System.out.println("Omkredsen er " + o);

        // Her indtaster jeg ikke tallene selv
        //System.out.println(omkredsRektangel(5,5));

    }

    public static double omkredsRektangel(double l, double b){
        double omkreds = l * 2 + b * 2;
        return omkreds;
    }
}
