import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Gambler {
    // TODO:
    // fix gui
    // add option for random integers for a certain size
    // add option for random size with random integers
    // add game element
    private static final Random RAND = new Random();

    public static void main(String[] args) {
        int[] array;
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter the size of the array you want to be sorted!");
            System.out.println("The lower the size, the faster it will be sorted!");
            
            int arraySize = userInput.nextInt(); // get the size of the array first
            if (arraySize <= 0) {
                System.out.println("Number must be greater than 0");
                return;
            }
            array = new int[arraySize]; // make an array on the user input size
            System.out.println("Enter the " + arraySize + " (unsorted) integers, seperated by spaces:");
            // read each integer and store it in the array
            for (int i = 0; i < arraySize; i++) {
                array[i] = userInput.nextInt();
            }
        }

        System.out.println("Your array consists of the numbers: " + Arrays.toString(array));
        System.out.println("We will now shuffle it until it is sorted!");
        System.out.println("Shuffling...");
        
        Instant start = Instant.now();
        shuffled(array);
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        timeTaken(duration);
    }

    /**
     * decides whether to print millis or millis and seconds depending on time
     * 
     * @param duration the time taken to sort the array
     */
    private static void timeTaken(Duration duration) {
        long ms = duration.toMillis();

        if (ms > 1000) {
            System.out.println("It took " + (ms / 1000.0) + " seconds to sort.");
        }
        System.out.println("It took " + ms + " milliseconds to sort.");
    }

    /**
     * Method to check if given array is sorted
     * 
     * @param array the user array
     * @return
     */
    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * method to shuffle an array randomly
     * @param array the user array
     */
    private static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            // pick a random index from 0 - i
            int j = RAND.nextInt(i + 1);

            // swap array[i] with the element at random index j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    /**
     * method that calls shuffle, counts amount of shuffles and displays the final result
     * @param array the user array
     * @return
     */
    public static int shuffled(int[] array) {
        int shuffles = 0;
        
        while (!isSorted(array)) {
            shuffle(array);
            shuffles++;
        }
        System.out.println("Here is your sorted array: " + Arrays.toString(array));
        System.out.println("It took " + shuffles + " shuffles to sort");
        
        return shuffles;
    }
}
