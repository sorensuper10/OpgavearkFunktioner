public class Opgave9 {
    public static void main(String[] args) {
        int tal1 = 7;
        int tal2 = 5;
        int m;
        m=max(tal1,tal2);

        // Her bruger jeg en sout
        System.out.println("Det største tal af " + tal1 + " og " + tal2 +" er " + m);

        // Her bruger jeg udskriv funktionen
        //udskriv(tal1,tal2,m);

        //m=max(2,11);
        //udskriv(2,11,m);

        //int x = 3;
        //m=max(x,7);
        //udskriv(x,7,m);


    }
    public static int max(int x, int y){
        int maximum;
        if (x > y){
            maximum = x;
        }
        else {
            maximum = y;
        }

        return maximum;
    }

    public static void udskriv(int x, int y, int maximum) {
        System.out.println("Det største tal af " + x + " og " + y +" er " + maximum);
    }
    }

