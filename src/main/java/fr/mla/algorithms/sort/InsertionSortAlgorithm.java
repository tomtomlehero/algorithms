package fr.mla.algorithms.sort;

import edu.princeton.StdOut;

/**
 * Created by mathieu on 25/05/2014.
 */
public class InsertionSortAlgorithm extends AbstractSortAlgorithm {

    public static void sort(Comparable a[]) {

        int n = a.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; (j > 0) && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }


    }


}
