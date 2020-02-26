// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2020
 */

class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     */
    static double[] insertionSort(double a[]) {
        if(a!=null) {
            double temp;
            for (int i = 1; i < a.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (a[j] < a[j - 1]) {
                        temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }
        }
        return a;
    }//end insertionsort

    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     */
    static double[] selectionSort(double a[]) {
        if (a!= null) {
            for (int i = 0; i < a.length; i++) {
                int min_idx = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[min_idx]) {
                        min_idx = j;
                    }
                    double temp = a[min_idx];
                    a[min_idx] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;


    }//end selectionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     */
    public static double[] quickSort(double a[]) {
        return quickSort(a, 0, a.length - 1);
    }

    private static double[] quickSort(double a[], int lo, int hi) {
        if (a != null) {
        if (hi <= lo) return a;
        int pivot = partition(a, lo, hi);
        quickSort(a, lo, pivot - 1);
        quickSort(a, pivot + 1, hi);
    }
        return a;
    }

    private static int partition(double[] numbers, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        double pivot = numbers[lo];
        while (true) {
            while (numbers[++i] < pivot) {
                if (i == hi) break;
            }
            while (pivot < numbers[--j]) {
                if (j == lo) break;
            }
            if (i >= j) break;
            double temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        numbers[lo] = numbers[j];
        numbers[j] = pivot;
        return j;
    }
    //end quicksort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative(double a[]) {
        if (a != null) {
            int n = a.length;
            double[] aux = new double[n];
            for (int i = 1; i < n; i = i + i) {
                for (int low = 0; low < n - i; low += i + i) {
                    merge(a, aux, low, low + i - 1, Math.min(low + i + i - 1, n - 1));
                }
            }
        }
        return a;
    }//end mergesortIterative

    public static void sort(double[] a) {
        double[] aux = new double[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(double[] a, double[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int midpoint = lo + (hi - lo) / 2;
        sort(a, aux, lo, midpoint);
        sort(a, aux, midpoint + 1, hi);
        merge(a, aux, lo, midpoint, hi);
    }

    private static void merge(double[] a, double[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }


    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive(double a[]) {
        if (a != null) {
            double[] aux = new double[a.length];
            sort(a, aux, 0, a.length - 1);
        }
        return a;
    }//end mergeSortRecursive







    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

}//end class
