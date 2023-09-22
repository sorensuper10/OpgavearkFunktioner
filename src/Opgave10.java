public class Opgave10 {
    public static void main(String[] args) {
        int tal1 = 7;
        int tal2 = 5;
        int tal3 = 6;
        int m;
        m=min(tal1,tal2,tal3);

        // Her bruger jeg en sout
        System.out.println("Det mindste tal af " + tal1 + " og " + tal2 + " og " + tal3 + " er " + m);

        // Her bruger jeg udskriv funktionen
        //udskriv(tal1,tal2,tal3,m);

        //m=min(2,11,5);
        //udskriv(2,11,5,m);

        //int x = 3;
        //m=min(x,7,5);
        //udskriv(x,7,5,m);


    }
    public static int min(int x, int y, int z) {
        int mindst = 0;
        if (x < y && x < z) {
            mindst = x;
        }
        if (y < x && y < z) {
            mindst = y;
        }
        if (z < x && z < y) {
            mindst = z;
        }
        return mindst;
    }

    public static void udskriv(int x, int y, int z, int mindst) {
        System.out.println("Det mindste tal af " + x + " og " + y + " og " + z + " er " + mindst);
    }
}
