public class Opgave8 {
    public static void main(String[] args) {
        int tal1 = 7;
        int tal2 = 5;
        int m;
        m=min(tal1,tal2);

        // Her bruger jeg en sout
        System.out.println("Det mindste tal af " + tal1 + " og " + tal2 +" er " + m);

        // Her bruger jeg udskriv funktionen
        //udskriv(tal1,tal2,m);

        //m=min(2,11);
        //udskriv(2,11,m);

        //int x = 3;
        //m=min(x,7);
        //udskriv(x,7,m);


    }
    public static int min(int x, int y){
        int mindst;
        if (x < y){
            mindst = x;
        }
        else {
            mindst = y;
        }

        return mindst;
    }

    public static void udskriv(int x, int y, int mindst) {
        System.out.println("Det mindste tal af " + x + " og " + y +" er " + mindst);
    }
}
