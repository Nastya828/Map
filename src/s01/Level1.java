package s01;

public class Level1 {
    public static int squirrel(int N) {
        int f = 1;
        int x = 0;
        for (int i = 1; i <= N; i++) {
            f *= i;
        }
        while (f != 0) {
            x = f % 10;
            f /= 10;
        }
        return x;
    }
}
