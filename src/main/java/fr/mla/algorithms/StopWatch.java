package fr.mla.algorithms;

/**
 * Created by mathieu on 25/05/2014.
 */
public class StopWatch {

    private long startTime = System.currentTimeMillis();

    public double elapsedTime() {
        return (System.currentTimeMillis() - startTime) / 1000;
    }


}
