
public class Task01 {

    static int fac(int n) {
        assert (n >= 0);
        assert (n <= 10) : "Число больше 10!!!";
        if (n < 2) {
            return 1;
        } else {
            int f = 2;
            for (int i = 2; i < n; i++){
                f *=i;
            }
            return f;
        }
    }


    public static void main(String[] args) {
        int n = 15;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fac(i);
            System.out.print(a[i] + " ");
        }

    }
}
