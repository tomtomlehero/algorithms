package fr.mla.algorithms.sort;

import edu.princeton.StdRandom;

/**
 * Created by mathieu on 25/05/2014.
 */
public class QuickSortAlgorithm extends AbstractSortAlgorithm {


    public static void sort(Comparable a[]) {

        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }




    public static void sort(Comparable a[], int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int k = partition(a, lo, hi);
        sort(a, lo, k - 1);
        sort(a, k + 1, hi);
    }

    private static int partition(Comparable a[], int lo, int hi) {

        Comparable v = a[lo];
        int i = lo;
        int j = hi + 1;

        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) break;
            }

            while (less(v, a[--j])) {
                if (j == lo) break;
            }

            if (i >= j) {
                break;
            }

            exch(a, i, j);
        }

        exch(a, lo, j);

        return j;
    }

}
