package sort;

import utils.StdDraw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 选择排序
 * 每次选第i小的数据到第i个索引位置
 */
public class SelectionSort {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++)
                if(a[j].compareTo(a[min]) < 0) min = j;
            SortUtil.exch(a, i, min);
            System.out.println(Arrays.toString(a));
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