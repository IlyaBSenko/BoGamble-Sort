import java.util.Arrays;
import java.util.Random;

public class BogoSortInOne {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 7, 8, 9, 1, 2, 3};

        BogoSortInOne now = new BogoSortInOne(); // ✅ class name fixed
        System.out.print("Unsorted: ");
        now.display1D(arr);

        int runs = now.bogosortInOne(arr);
        System.out.println("\nIt took " + runs + " run(s) to get sorted in ONE shuffle!\n");

        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        System.out.print("Sorted:   ");
        now.display1D(sorted);
    }

    /** Performs repeated one-shuffle trials until a single shuffle yields a sorted array. */
    int bogosortInOne(int[] arr) {
        Random rand = new Random();
        int runs = 0;

        int[] original = Arrays.copyOf(arr, arr.length);
        int[] shuffled = new int[arr.length];

        int[] target = Arrays.copyOf(arr, arr.length);
        Arrays.sort(target);

        do {
            runs++;
            System.arraycopy(original, 0, shuffled, 0, arr.length);
            shuffle(shuffled, rand);
        } while (!Arrays.equals(shuffled, target));

        return runs;
    }

    /** Fisher–Yates shuffle (correct inclusive range). */
    void shuffle(int[] arr, Random rand) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // inclusive range [0, i]
            swap(arr, i, j);
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void display1D(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
}
