import java.util.Scanner;

public class Opgave13Tavle extends Opgave12 {
    public static void main(String[] args) {
        System.out.println("Skriv et årstal og måned");
        Scanner input = new Scanner(System.in);
        int year;
        int month;
        year = input.nextInt();
        month = input.nextInt();

        boolean leapyear = leapyear(year);
        int days;
        days = daysInMonth(leapyear,month);
        System.out.println("er " + year + " et skudår? " + leapyear);
        System.out.println("der er " + days + " dage i måned " + month + " i år " + year);

    }

    public static boolean leapyear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static int daysInMonth(boolean leapYear, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return leapYear ? 29 : 28;
            default: return 0;
        }
    }
}
