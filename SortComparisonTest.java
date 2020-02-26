package sortComparison;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
}
    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
//        String path = "C:\\Users\\Daniel Grace\\eclipse-workspace\\sortComparison\\" ;
//        String[] files = new String[]{path + "numbers10.txt",
//                path + "numbers100.txt",
//                path + "numbers1000.txt",
//                path + "numbers1000Duplicates.txt",
//                path + "numbersNearlyOrdered1000.txt",
//                path + "numbersReverse1000.txt",
//                path + "numbersSorted1000.txt"};
//
//
//        for (String file : files) {
//            String toPrint = "";
//            for (int i = file.length() - 1; i > 0; i--) {
//                if (file.charAt(i) == '\\') break;
//                toPrint = file.charAt(i) + toPrint;
//            }
//
//            ArrayList<Double> doubles = new ArrayList<>();
//            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//                String line = br.readLine();
//                while (line != null) {
//                    line = br.readLine();
//                    if (line != null) doubles.add(Double.parseDouble(line));
//                }
//
//                double[] a = resetArray(doubles);
//                double startTime = System.nanoTime();
//                SortComparison.selectionSort(a);
//                double endTime = System.nanoTime();
//                double duration = (endTime - startTime) / 1000000;
//                System.out.println("Selection Sort time for " + toPrint + ": " + duration + "ms");
//
//                a = resetArray(doubles);
//                startTime = System.nanoTime();
//                SortComparison.insertionSort(a);
//                endTime = System.nanoTime();
//                duration = (endTime - startTime) / 1000000;
//                System.out.println("Insertion Sort time for " + toPrint + ": " + duration + "ms");
//
//                a = resetArray(doubles);
//                startTime = System.nanoTime();
//                SortComparison.mergeSortIterative(a);
//                endTime = System.nanoTime();
//                duration = (endTime - startTime) / 1000000;
//                System.out.println("MergeSort Iterative time for " + toPrint + " was " + duration + "ms");
//
//
//                a = resetArray(doubles);
//                startTime = System.nanoTime();
//                SortComparison.mergeSortRecursive(a);
//                endTime = System.nanoTime();
//                duration = (endTime - startTime) / 1000000;
//                System.out.println("MergeSort Recursive time for " + toPrint + ": " + duration + "ms");
//
//                a = resetArray(doubles);
//                startTime = System.nanoTime();
//                SortComparison.quickSort(a);
//                endTime = System.nanoTime();
//                duration = (endTime - startTime) / 1000000;
//                System.out.println("QuickSort time for " + toPrint + ": " + duration + "ms\n ");
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//
//    private static double[] resetArray(ArrayList<Double> doubles) {
//        double[] a;
//        a = new double[doubles.size()];
//        for (int j = 0; j < a.length; j++) {
//            a[j] = doubles.get(j);
//        }
//        return a;
//    }


//Selection Sort time for numbers10.txt: 0.9401ms
//Insertion Sort time for numbers10.txt: 0.0073ms
//MergeSort Iterative time for numbers10.txt was 0.3596ms
//MergeSort Recursive time for numbers10.txt: 0.0137ms
//QuickSort time for numbers10.txt: 0.0208ms
// 
//Selection Sort time for numbers100.txt: 0.2137ms
//Insertion Sort time for numbers100.txt: 0.2697ms
//MergeSort Iterative time for numbers100.txt was 0.0601ms
//MergeSort Recursive time for numbers100.txt: 0.0589ms
//QuickSort time for numbers100.txt: 0.0371ms
// 
//Selection Sort time for numbers1000.txt: 10.2807ms
//Insertion Sort time for numbers1000.txt: 7.5301ms
//MergeSort Iterative time for numbers1000.txt was 1.2202ms
//MergeSort Recursive time for numbers1000.txt: 0.5491ms
//QuickSort time for numbers1000.txt: 1.3037ms
// 
//Selection Sort time for numbers1000Duplicates.txt: 2.649ms
//Insertion Sort time for numbers1000Duplicates.txt: 0.6593ms
//MergeSort Iterative time for numbers1000Duplicates.txt was 0.1462ms
//MergeSort Recursive time for numbers1000Duplicates.txt: 0.0939ms
//QuickSort time for numbers1000Duplicates.txt: 0.1484ms
// 
//Selection Sort time for numbersNearlyOrdered1000.txt: 1.3799ms
//Insertion Sort time for numbersNearlyOrdered1000.txt: 0.4013ms
//MergeSort Iterative time for numbersNearlyOrdered1000.txt was 0.1104ms
//MergeSort Recursive time for numbersNearlyOrdered1000.txt: 0.0988ms
//QuickSort time for numbersNearlyOrdered1000.txt: 0.2413ms
// 
//Selection Sort time for numbersReverse1000.txt: 0.8844ms
//Insertion Sort time for numbersReverse1000.txt: 0.5476ms
//MergeSort Iterative time for numbersReverse1000.txt was 0.1016ms
//MergeSort Recursive time for numbersReverse1000.txt: 0.0692ms
//QuickSort time for numbersReverse1000.txt: 0.984ms
// 
//Selection Sort time for numbersSorted1000.txt: 1.0544ms
//Insertion Sort time for numbersSorted1000.txt: 0.7057ms
//MergeSort Iterative time for numbersSorted1000.txt was 0.1039ms
//MergeSort Recursive time for numbersSorted1000.txt: 0.413ms
//QuickSort time for numbersSorted1000.txt: 1.3469ms
// 
//a. Which of the sorting algorithms does the order of input have an impact on? Why?
// Insertion Sort as the Worst case is reverse order
//b. Which algorithm has the biggest difference between the best and worst performance, based
//on the type of input, for the input of size 1000? Why?
// Selection Sort because it takes well over 10ms to sort the 1000 numbers
//c. Which algorithm has the best/worst scalability, i.e., the difference in performance time
//based on the input size? Please consider only input files with random order for this answer.
// Selection Sort as the difference between 10 numbers and 1000 is great
//d. Did you observe any difference between iterative and recursive implementations of merge
//sort?
//Recursive tended to be quicker than iterative 
//e. Which algorithm is the fastest for each of the 7 input files?
// Insertion Sort, Quick Sort, Merge Sort Recursive, Merge Sort Recursive, Merge Sort Recursive, Merge Sort Recursive