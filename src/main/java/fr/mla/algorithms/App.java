package fr.mla.algorithms;

import edu.princeton.StdRandom;
import fr.mla.algorithms.sort.AbstractSortAlgorithm;
import fr.mla.algorithms.sort.SelectionSortAlgorithm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int N = 1000;
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(1000000);
        }


        AbstractSortAlgorithm.show(a);
        SelectionSortAlgorithm.sort(a);
        AbstractSortAlgorithm.show(a);

    }
}
