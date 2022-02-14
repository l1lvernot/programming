
import java.util.Scanner;

public class Q3 {
    static void shtoto(int n, String a) {
        int c = n / 2;
        for (int i = 1; i < n + 1; i += 2) {
            for (int x = c; x > 0; x--) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(a);
            }
            System.out.println();
            c--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        shtoto(s.nextInt(), s.next());
    }
}
