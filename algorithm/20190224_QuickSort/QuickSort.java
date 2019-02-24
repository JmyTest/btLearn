import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]) {
        int[] a = {3, 5, 2, 1};
        quicksort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void quicksort(int[] a) {
        int length = a.length;
        if (length == 0 || length == 1) {
            return;
        }
        int partition = quicksort_c(a, 0, length - 1);
        quicksort_c(a, 0, partition - 1);
        quicksort_c(a, partition + 1, length - 1);
    }

    public static int quicksort_c(int[] a, int left, int right) {
        int j = right;
        int i = left;
        int value = a[left];
        while (i < j) {
            while (i < j && a[j] >= value) {
                j--;
            }
            a[i] = a[j];
            while (i < j && a[i] <= value) {
                i++;
            }
            a[j] = a[i];

        }
        a[i] = value;
        return i;
    }

}


