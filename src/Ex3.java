import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 0; i < num; i++) {
            for (int x = 0; x < i + 1; x++) {
                System.out.print('*');
            }
            for (int k = 1; k < num - i; k++) {
                System.out.print('#');
            }
            System.out.println();
        }

    }
}
