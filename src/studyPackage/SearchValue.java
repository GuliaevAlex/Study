package studyPackage;

import java.util.Arrays;
import java.util.Random;

public class SearchValue {
    public static void main(String[] args) {
        int bound = 5000000;
        Random random = new Random(bound);
        int valueToSearch = random.nextInt(bound);
        System.out.println("valueToSearch: " + valueToSearch);

        int [] arr = new int[bound];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToSearch;
        }

        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long finish = System.currentTimeMillis();
        long result = finish-start;



    }
}
