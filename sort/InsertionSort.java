package sort;

import java.util.Arrays;
import java.util.Scanner;

import static sort.SortUtil.*;

/**
 * 如果j位置的值小于前面的值，就将他与前面比它小的一一交换。
 */
public class InsertionSort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(a));
        sort(a);
        assert SortUtil.isSorted(a);
        SortUtil.show(a);
    }
}
