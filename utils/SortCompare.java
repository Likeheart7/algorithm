package utils;

import sort.InsertionSort;
import sort.SelectionSort;
import sort.ShellSort;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author chenx
 * @create 2023-07-19 14:06
 */
public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) InsertionSort.sort(a);
        if (alg.equals("Selection")) SelectionSort.sort(a);
        if (alg.equals("Shell")) ShellSort.sort(a);
        if (alg.equals("Merge")) InsertionSort.sort(a);
        if (alg.equals("Quick")) InsertionSort.sort(a);
        if (alg.equals("Heap")) InsertionSort.sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        StdOut.printf("For %d random Doubles\n", N);
        StdOut.printf("%s waste %.1fs , %s waste %.1fs\n", alg1, t1, alg2, t2);
        StdOut.printf("%s is %.1f times faster than %s\n",alg1, t2 / t1, alg2);
    }
}
