
public class Q1 {
    static int ok(int x, int y){
        if(y-x>5)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        int x = ok(6,2);
        System.out.println(x);
        int n = 7;
        for (int i = 1; i < 4; i++) {
            System.out.println(ok(i,n));
        }

    }
}
