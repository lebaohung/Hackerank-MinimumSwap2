import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) throws Exception {
        int count = 0;
        for (int i = 0; i < arr.length; i ++) {
            while (arr[i] != i + 1) {
                swap(arr, i, arr[i] -1);
                count ++;
            }
        }
    return count;
    }

    static void swap(int[] arr, int a, int b) throws Exception {
        try {
            arr[a] = arr[b] + (arr[b] = arr[a]) - arr[a];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not available element in array");
        }
        return;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
