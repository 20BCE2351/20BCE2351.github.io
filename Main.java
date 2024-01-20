import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    static void reverse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] row = new int[arr.length];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }
        int[] reversedArray = Array.reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(Array.reverse(arr[i])));
            System.out.println();
        }

        sc.close();
    }

    public static void main(String[] args) {
        reverse();
    }
}
