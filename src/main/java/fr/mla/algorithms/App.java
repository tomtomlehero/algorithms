package fr.mla.algorithms;

import edu.princeton.StdOut;
import edu.princeton.StdRandom;
import fr.mla.algorithms.sort.AbstractSortAlgorithm;
import fr.mla.algorithms.sort.InsertionSortAlgorithm;
import fr.mla.algorithms.sort.QuickSortAlgorithm;
import fr.mla.algorithms.sort.SelectionSortAlgorithm;

public class App {

    private static final int length = 10000000;
    private static final int range = 1000000000;


    public static void main(String[] args) {
        test();
    }


    private static void test() {
        Integer[] a = AbstractSortAlgorithm.randomIntegerArray(length, range);
//        AbstractSortAlgorithm.show(a);
        StopWatch timer = new StopWatch();
        QuickSortAlgorithm.sort(a);
        StdOut.println("Quick : " + timer.elapsedTime() + " sec.");
//        AbstractSortAlgorithm.show(a);


    }

    private static void compare() {


        Integer[] a = AbstractSortAlgorithm.randomIntegerArray(length, range);
        StopWatch timer;

        Comparable selection[] = AbstractSortAlgorithm.arraycopy(a);
        Comparable insertion[] = AbstractSortAlgorithm.arraycopy(a);
        Comparable quick[] = AbstractSortAlgorithm.arraycopy(a);

        timer = new StopWatch();
        SelectionSortAlgorithm.sort(selection);
        StdOut.println("Selection : " + timer.elapsedTime() + " sec.");

        timer = new StopWatch();
        InsertionSortAlgorithm.sort(insertion);
        StdOut.println("Insertion : " + timer.elapsedTime() + " sec.");

        timer = new StopWatch();
        QuickSortAlgorithm.sort(quick);
        StdOut.println("Quick : " + timer.elapsedTime() + " sec.");


    }


}
