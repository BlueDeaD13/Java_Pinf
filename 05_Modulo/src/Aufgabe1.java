public class Aufgabe1 {
    public static void main(String[] args) {
        int i = 12 % 4;
        System.out.println(i);
        double ii = 13 % 7;
        System.out.println(ii);
        float iii = 27 % 5;
        System.out.println(iii);
        boolean iv = (25 % 2 == 0);
        System.out.println(iv);

        int n = 11;
        do {
            System.out.println(n % 3);
            n -= 2;
        } while(n > 0);
    }
}
