import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// adda proper java docs to all methods

public class g2 {


    // TODO:
    // add time taken to sort array
    // add java docs
    // fix gui
    // add time.sleep equivelnt for shuffling message when shuffling
    // add otpion for random integers for a certain size
    // add option for random size with random integers
    public static void main(String[] args) {
        int[] array;
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter the size of the array you want to be sorted!");
            System.out.println("The lower the size, the faster it will be sorted!");
            int arraySize = userInput.nextInt(); // get the size of the array first
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
        
        shuffled(array);
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            // pick a random index from 0 - i
            int j = rand.nextInt(i + 1);

            // swap array[i] with the element at random index j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

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
