import java.util.Scanner;

public class Ex3 {
    static int shtoto(int n) {
        int l = 0;
        while (n != 0) {
            l++;
            n /= 10;
        }
        return l;
    }

    static int zzz(int n) {
        int x = (int) (n / (Math.pow(10, shtoto(n) - 1)));
        int x1 = n % 10;
        n = n * 10 + ((x + x1) % 10);
        x1 = n % 10;
        n = n * 10 + ((x + x1) % 10);
        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println(zzz(s.nextInt()));
        }
    }
}