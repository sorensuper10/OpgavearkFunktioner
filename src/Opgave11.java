public class Opgave11 {
    public static void main(String[] args) {
        int tal1 = 7;
        int tal2 = 5;
        int tal3 = 6;
        int m;
        m=max(tal1,tal2,tal3);

        // Her bruger jeg en sout
        System.out.println("Det største tal af " + tal1 + " og " + tal2 + " og " + tal3 + " er " + m);

        // Her bruger jeg udskriv funktionen
        //udskriv(tal1,tal2,tal3,m);

        //m=max(2,11,5);
        //udskriv(2,11,5,m);

        //int x = 3;
        //m=max(x,7,5);
        //udskriv(x,7,5,m);


    }
    public static int max(int x, int y, int z) {
        int maximum = 0;
        if (x > y && x > z) {
            maximum = x;
        }
        if (y > x && y > z) {
            maximum = y;
        }
        if (z < x && z < y) {
            maximum = z;
        }
        return maximum;
    }

    public static void udskriv(int x, int y, int z, int maximum) {
        System.out.println("Det Største tal af " + x + " og " + y + " og " + z + " er " + maximum);
    }
}

