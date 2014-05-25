package fr.mla.algorithms;

import edu.princeton.StdOut;
import edu.princeton.StdRandom;
import fr.mla.algorithms.sort.AbstractSortAlgorithm;
import fr.mla.algorithms.sort.InsertionSortAlgorithm;
import fr.mla.algorithms.sort.SelectionSortAlgorithm;

public class App
{
    public static void main( String[] args )
    {

        int length = 100000;
        int range = 1000000;

        Integer[] a = AbstractSortAlgorithm.randomIntegerArray(length, range);

        //AbstractSortAlgorithm.show(a);
        StopWatch timer = new StopWatch();

        SelectionSortAlgorithm.sort(a);

        StdOut.println("Selection : " + timer.elapsedTime() + " sec.");
        //AbstractSortAlgorithm.show(a);



        a = AbstractSortAlgorithm.randomIntegerArray(length, range);
        //AbstractSortAlgorithm.show(a);


        timer = new StopWatch();

        InsertionSortAlgorithm.sort(a);

        StdOut.println("Insertion : " + timer.elapsedTime() + " sec.");
        //AbstractSortAlgorithm.show(a);

    }
}
