import java.util.Scanner;
public class Ex2 {
    static Scanner s = new Scanner(System.in);


    static int shtoto(int a, int b) {
        return (a * 60) + b;
    }

    static int pochemuto(int a, int b, int a1, int b1) {
        return shtoto(a, b) - shtoto(a1, b1);
    }

    static void zathemto() {
        int maxm = Integer.MIN_VALUE;
        int maxd = 0;

        for (int i = 1; i < 8; i++) {
            System.out.println("Day " + i + ". Start: ");
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Day " + i + ": End: ");
            int a1 = s.nextInt();
            int b1 = s.nextInt();

            int result_i = pochemuto(a1, b1, a, b);

            if (result_i > maxm) {
                maxm=result_i;
                maxd = i;
            }
        }
        System.out.println("Day " + maxd);
    }

    public static void main(String[] args) {
        zathemto();
    }
}
