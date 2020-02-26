import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author Daniel Grace
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
        double[] array = null;

        assertArrayEquals("testing on a an empty array", null, SortComparison.insertionSort(array),0);
        assertArrayEquals("testing on a an empty array", null, SortComparison.selectionSort(array),0);
        assertArrayEquals("testing on a an empty array", null, SortComparison.quickSort(array),0);
        assertArrayEquals("testing on an empty array", null, SortComparison.mergeSortIterative(array),0);
        assertArrayEquals("testing on an empty array", null, SortComparison.mergeSortRecursive(array),0);
    }

    @Test
    public void testInsertion(){
        double[] array = new double[]{3.3, 4.1, 52.3, 52.2, 144.5, 134.6, 72.25, 2352.2, 42.45, 245.3, 235.55};
        double[] result = new double[]{3.3, 4.1, 42.45, 52.2, 52.3, 72.25, 134.6, 144.5, 235.55, 245.3, 2352.2};

        assertArrayEquals("testing the insertion sort", result, SortComparison.insertionSort(array), 0);
    }
    @Test
    public void testSelection(){
        double[] array = new double[]{3.3, 4.1, 52.3, 52.2, 144.5, 134.6, 72.25, 2352.2, 42.45, 245.3, 235.55};
        double[] result = new double[]{3.3, 4.1, 42.45, 52.2, 52.3, 72.25, 134.6, 144.5, 235.55, 245.3, 2352.2};

        assertArrayEquals("testing the insertion sort", result, SortComparison.selectionSort(array), 0);
    }
    @Test
    public void testQuickSort(){
        double[] array = new double[]{3.3, 4.1, 52.3, 52.2, 144.5, 134.6, 72.25, 2352.2, 42.45, 245.3, 235.55};
        double[] result = new double[]{3.3, 4.1, 42.45, 52.2, 52.3, 72.25, 134.6, 144.5, 235.55, 245.3, 2352.2};

        assertArrayEquals("testing the insertion sort", result, SortComparison.quickSort(array), 0);
    }
    @Test
    public void testMergeIterative(){
        double[] array = new double[]{3.3, 4.1, 52.3, 52.2, 144.5, 134.6, 72.25, 2352.2, 42.45, 245.3, 235.55};
        double[] result = new double[]{3.3, 4.1, 42.45, 52.2, 52.3, 72.25, 134.6, 144.5, 235.55, 245.3, 2352.2};

        assertArrayEquals("testing the insertion sort", result, SortComparison.mergeSortIterative(array), 0);
    }
    @Test
    public void testMergeRecursive(){
        double[] array = new double[]{3.3, 4.1, 52.3, 52.2, 144.5, 134.6, 72.25, 2352.2, 42.45, 245.3, 235.55};
        double[] result = new double[]{3.3, 4.1, 42.45, 52.2, 52.3, 72.25, 134.6, 144.5, 235.55, 245.3, 2352.2};

        assertArrayEquals("testing the insertion sort", result, SortComparison.mergeSortRecursive(array), 0);
    }

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}