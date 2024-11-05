import java.util.*;
import java.io.*;

public class PriorityQueueLab {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue;
        Scanner scan = null;
        pQueue = new PriorityQueue<Integer>();

        try {
            // Provide the correct path to the file
            scan = new Scanner(new File("RanIntegers.txt"));
            //pQueue = new PriorityQueue<Integer>();

            // Read integers from the file and add to the priority queue
            while (scan.hasNextInt()) {
                pQueue.add(scan.nextInt());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } 

        // Print out the contents of the priority queue
        System.out.println("PriorityQueue contents: " + pQueue);
    }
}
