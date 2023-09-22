import java.util.Scanner;

public class Opgave12 {
    public static void main(String[] args) {
        skuudaar();
    }

    public static boolean skuudaar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        System.out.println("Year: " + year);
        boolean skudaar = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    skudaar = true;
                }
            }
            else skudaar = true;
        }
        System.out.println(year+" er et skudår " + skudaar);
        return skudaar;
    }
}

