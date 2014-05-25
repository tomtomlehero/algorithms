package fr.mla.algorithms.sort;

import edu.princeton.StdOut;
import edu.princeton.StdRandom;

/**
 * Created by mathieu on 18/05/2014.
 */
public abstract class AbstractSortAlgorithm {

    //public abstract void sort(Comparable a[]);

    protected static boolean less(Comparable x, Comparable y) {
        return (x.compareTo(y) < 0);
    }

    protected static void exch(Comparable a[], int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable a[]) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println("]");
    }

    public static Integer[] randomIntegerArray(int length, int range) {
        Integer[] a = new Integer[length];
        for (int i = 0; i < length; i++) {
            a[i] = StdRandom.uniform(range);
        }
        return a;

    }


}
