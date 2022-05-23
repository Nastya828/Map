package test;


import java.util.Arrays;

public class Task01 {

    public static int[] getUnique(int[] numbers) {
        int[] a = new int[numbers.length];
        a[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (numbers[i] == a[j]) {
                    break;
                }
                if (j == 0) {
                    a[i] = numbers[i];
                }
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 4, 1, 7, 4, 9};
        System.out.println(Arrays.toString(getUnique(numbers)));
    }

}

