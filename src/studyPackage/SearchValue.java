package studyPackage;

import java.util.Arrays;
import java.util.Random;

public class SearchValue {
    public static void main(String[] args) {
        int bound = 5000000;
        Random random = new Random(bound);
        int valueToSearch = random.nextInt(bound);
        int randomValue = random.nextInt(bound);
        System.out.println("Искомая переменная" + valueToSearch);

        int [] arr = new int[bound];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomValue;
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==valueToSearch)
                break;
        }
        long finish = System.currentTimeMillis();
        long result = finish-start;
        System.out.println("Поиск переменной в не отсортированном массиве пробежкой for выполнен за: " + result + "миллисекунд");

        start = System.currentTimeMillis();
        Arrays.sort(arr);
        finish = System.currentTimeMillis();
        result = finish-start;
        System.out.println("Массив отсортировался Array.sort за: " + result + "миллисекунд");

        start = System.currentTimeMillis();
        Arrays.binarySearch(arr,valueToSearch);
        finish = System.currentTimeMillis();
        result = finish-start;
        System.out.println("Бинарный поиск переменной выполнился за: " + result + "миллисекунд");

        start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==valueToSearch)
                break;}
        finish = System.currentTimeMillis();
        result = finish-start;
        System.out.println("Поиск пробежкой for в отсортированном массиве выполнился за: " + result + "миллисекунд");

    }
}
