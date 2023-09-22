public class Opgave3 {
    public static void main(String[] args) {
        udskriv("Søren",5);
        //udskrivNavn("Søren",5);
    }

    public static void udskriv(String navn, int n) {
        for (int i = 1; i<=n; i++)
            System.out.println(i + " " + navn);
        }

        // En anden måde at lave opgave 3 på
        public static void udskrivNavn(String navn, int n) {
        int i = n;
        while(i>0) {
            System.out.println(i+" " +navn);
            i--;
        }
    }
}
