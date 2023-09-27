import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("m1(1) = " + m1(2));
        System.out.println("Arrays.toString(m4(\"Java is the best or java as sdf alskdfj asdpofk jsdfsd\")) = " +
                Arrays.toString(m4("Java is the best or java as sdf alskdfj asdpofk jsdfsd")));
        int[] arr = new int[]{1, 3, 4, 5, 77, 4, 3, 56, 3, 3, 7, 8, 7, 5, 3};
        System.out.println("Arrays.toString(m5(arr, 3 )) = " + Arrays.toString(m5(arr, 3)));
        System.out.println("Arrays.toString(m6(arr)) = " + Arrays.toString(m6(arr)));
    }

    public static int[] m6(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int minEl = 99999999;
        int maxEl = -99999999;
        //9 5 1 8
        for (int i = 0; i < arr.length; i++) {
            if (minEl > arr[i]) {
                minEl = arr[i];
            }
            if (maxEl < arr[i]) {
                maxEl = arr[i];
            }
        }

        if (maxEl == minEl) {
            int[] res = new int[1];
            res[0] = maxEl;
            return res;
        }

        int[] res = new int[2];
        res[0] = minEl;
        res[1] = maxEl;
        return res;

//        Arrays.sort(arr);
//
//        if (arr[0] == arr[arr.length -1]) {
//            int[] res = new int[1];
//            res[0] = arr[0];
//            return res;
//        }
//
//        int[] res = new int[2];
//        res[0] = arr[0];
//        res[1] = arr[arr.length -1];
//        return res;

    }

    public static int[] m5(int[] arr, int toRemove) {
        int toRemoveAmount = 0;
        for (int a : arr) {
            if (a == toRemove) {
                toRemoveAmount++;
            }
        }

        int[] res = new int[arr.length - toRemoveAmount];
        int resIndex = 0;

        for (int a : arr) {
            if (a != toRemove) {
                res[resIndex] = a;
                resIndex++;
            }
        }

        Arrays.sort(res);

        return res;
    }

    public static String[] m4(String str) {
        String[] words = str.split(" ");

        int jCount = 0;
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (lowerWord.startsWith("j") || lowerWord.endsWith("j")) {
                jCount++;
            }
        }

        String[] res = new String[jCount];
        int resIndex = 0;

        for (int i = 0; i < words.length; i++) {
            String lowerWord = words[i].toLowerCase();
            if (lowerWord.startsWith("j") || lowerWord.endsWith("j")) {
                if (resIndex % 2 != 0) {
                    res[resIndex] = words[i].toUpperCase();
                } else {
                    res[resIndex] = lowerWord;
                }
                resIndex++;
            }
        }

        return res;
    }

    public static void m3() {
        int[] arr = {11, 3, 14, 16, 7};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    System.out.println("arr[" + i + "] = " + arr[i] + " swap with arr[" + (i + 1) + "] = " + arr[i + 1]);

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
            System.out.println("after iteration -> " + Arrays.toString(arr));
        }
        System.out.println("in the end -> " + Arrays.toString(arr));
    }

    public static void m2() {
        int[] arr = {1, 2, 5, 2, 1, 8, 99, 55, 43, 66, 334};
        String[] sArr = {"aa", "ab", "aaa", "bc", "bb"};

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("Arrays.toString(sArr) = " + Arrays.toString(sArr));
        Arrays.sort(sArr);
        System.out.println("Arrays.toString(sArr) = " + Arrays.toString(sArr));
    }

    public static int m1(int growSize) {
        for (int i = 0; i < 10; i += growSize) {
            if (i == 9) {
                return i;
            }
            System.out.println("after check in " + i + " iteration");
        }

        return -1;
    }

    public static void m1() {
        int[] arr = {11, 3, 14, 16, 7, 278, 22, 1, -3, -22, -999};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}