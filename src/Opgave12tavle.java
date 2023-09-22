import java.util.Scanner;

public class Opgave12tavle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Skriv et årstal");
        year = input.nextInt();
        System.out.println(skudaar(year));

    }

    public static boolean skudaar(int year) {
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        else if (year % 400 == 0) {
            return true;
        } else
        return false;
    }
}

