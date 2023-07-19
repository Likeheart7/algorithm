package sort;

/**
 * @author chenx
 * @create 2023-07-19 13:46
 */
public abstract class SortUtil {
    static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if(less(a[i], a[i-1])) return false;
        return true;
    }
}
