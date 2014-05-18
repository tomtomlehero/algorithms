package fr.mla.algorithms.sort;

/**
 * Created by mathieu on 18/05/2014.
 */
public class SelectionSortAlgorithm extends AbstractSortAlgorithm {


    public static void sort(Comparable a[]) {

        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }


    }
}
