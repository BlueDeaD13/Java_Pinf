public class Main {
    public static void main(String[] args) {
        AufgabeA();
        AufgabeB();
        AufgabeC();
    }

    public static  void AufgabeA() {
            System.out.println("Vollzeit: " + 40 * 13.50);
            System.out.println("Teilzeit: " + 20 * 13.50);
    }

    public static void AufgabeB() {
        double okt=126.4;
        double sep=192.9;
        double aug=241.2;

        double mw= (okt + sep + aug)/3;
        System.out.println(mw);
        System.out.println(okt/31);
        System.out.println(sep/30);
        System.out.println(aug/31);
    }
    public static void AufgabeC () {
        double A = 7.10;
        double B = 6.00;
        int i;
        for (i = 60; B < A; i++) {
            A += 0.06;
            B += 0.10;
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(i);
    }

}