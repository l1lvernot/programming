
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < i+1; x++) {
                System.out.print('*');
            }
            for (int y = 1; y < n-i; y++) {
                System.out.print('#');
            }
            System.out.println();
        }

    }
}
