package com.company;

public class Main {

    public static void main(String[] args) {

    }

    //First problem
    public static void printArrayElements() {
        System.out.println("First array is:");
        int[] arr = {1, 2, 3, 5, 6, 7, 99};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //Second problem
    public static void printArrayOfZeroValues() {
        System.out.println("Second array is:");
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    // Third problem
    public static void printArrayElementsFromOneToThousand() {
        System.out.println("Third array is:");
        int[] array1 = new int[1000];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    //Forth problem
    public static void printEvenElements() {
        System.out.println("Forth array is:");
        byte[] array1 = new byte[30];
        int index = 0;
        for (byte j = -30; j <= 30; j += 2) {
            if (j != 0) {
                array1[index] = j;
                index++;
            }
        }
        for (int k = 0; k < array1.length; k++) {
            System.out.println(array1[k]);
        }
    }

    // Problem Five
    public static void printOddElementsOfArray() {
        System.out.println("The fifth array is:");
        short[] array2 = new short[150];
        int index1 = 0;
        for (short i = 1; i < 300; i += 2) {
            array2[index1] = i;
            index1++;
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

    //Problem six
    public static void arrayElementsDividedByFive() {
        System.out.println("Numbers divided by 5:");
        int k = 5;
        int[] array1 = {23, -18, 39, 50, 12, 10, 5};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % k == 0) {
                System.out.println(array1[i]);
            }
        }
    }

    //Problem seven
    public static void printdoubleElementsGreaterthan() {
        System.out.println("Numbers greater than 24.56:");
        double k = 24.56;
        double[] arr = {1.3, 5.7, 24.9, -23.5, 45.2, 65.8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                System.out.println(arr[i]);
            }
        }
    }

    //Problem eight
    public static void printElementsGreaterOrSmallerThan(int[] arr, float x, float y) {
        System.out.println("Numbers greater than 35.56 and smaller than -34.655:");
        float[] array = {2.1F, 45.2F, -56.8F, -2.72F, 349.12F, -111.34F};
        float a = 35.56F;
        float b = -34.655F;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a || array[i] < b) {
                System.out.println(array[i]);
            }
        }
    }

    //Problem nine, sort in ascending order
    public static void sortDoubleArrayInAscendingOrder() {
        System.out.println("Sorted array in Ascending order");
        double[] arr = {4.52, 6.7, -5.3, 2.8, -6, -2.1, 0.5};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }

    //Problem nine, sort in descending order
    public static void sortDoubleArrayInDescendingOrder() {
        System.out.println("Sorted array in descending order");
        double[] arr = {4.52, 6.7, -5.3, 2.8, -6, -2.1, 0.5};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }

    //Problem ten
    public static void printCountOfALetters() {
        System.out.println("Count of character 'a'");
        String string = "armenia is amazing";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }

    //Problem eleven
    public static void printYesOrNot() {
        System.out.println("Is there the character 'b' in the string: ");
        String string = "beautiful mind";
        if (string.indexOf("b") != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Problem twelve
     public static void printCountOfPowerOfTwoNumbers(){
         System.out.println("Count of numbers that are the power of 2:");
         int [] arrayOfNumbers= {2, 4, 6, 32, 7, 8, 43};
         int count=0;
         for (int i=0; i<arrayOfNumbers.length; i++){
             if((arrayOfNumbers[i]&(arrayOfNumbers[i]-1))==0){
                 count++;
             }
         }
         System.out.println(count);
     }
}
