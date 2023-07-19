package sort;

import utils.SortCompare;

import java.util.Arrays;
import java.util.Scanner;

import static sort.SortUtil.*;

/**
 * shell排序就是将一个大数组中间隔为h的小数组排序，使总体趋于有序，最后h减至1就等于插入排序
 * 本质上就是插入排序的一种优化
 */
public class ShellSort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
                    exch(a, j, j - h);
            }
            h = h / 3;
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
