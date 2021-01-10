package com.homeWork_Lesson_6_Task_2.arrayOperations;

public class ArrayOperations {
    public static int[] arrayRemoveDuplicatesAndSort(int[] arrayInt){
        int counter = 0;
        boolean isOriginalZeroInArray = false;
        for (int i = 0; i < arrayInt.length; i++) {                 // looking for first original 0 (from initialize)
            if (arrayInt[i] == 0){                                  // because after deleting elements we will get zero on their places
                isOriginalZeroInArray = true;
                counter ++;
                break;
            }
        }
        for (int i = 0; i < arrayInt.length - 1; i++) {             // deleting duplicates (set to zero)
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    arrayInt[j] = 0;
                }
            }
        }

        for (int i = 0; i < arrayInt.length; i++) {                 // counting unique elements (before counter = 1 if array has unique Zero)
            if(arrayInt[i] != 0){
                counter++;
            }
        }
        System.out.println("Array after deleting duplicates: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + "  ");
        }
        System.out.println(" ");

        for (int i = arrayInt.length-1; i > 0; i--) {                // Bubble-sort of array
            for (int j = 0; j < i; j++) {
                if (arrayInt[j] > arrayInt[j+1]) {
                    int buffer = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = buffer;
                }
            }
        }

        int[] arrayIntResult = new int[counter];                     // Creating a new array without duplicates
        /*
            The counter is the number of unique elements in the original array (including the unique zero, if any).
            The number of unique elements that are searched for in the loop will always match the size of the new array

         */
        int indexOldArray = 0;
        int indexNewArray = 0;
        while ((indexOldArray < arrayInt.length) && (indexNewArray < arrayIntResult.length)){
            if ((arrayInt[indexOldArray] == 0) && (isOriginalZeroInArray)){      // Checking the next value for a unique 0
                arrayIntResult[indexNewArray] = arrayInt[indexOldArray];         // (injected into the original array)
                isOriginalZeroInArray = false;                                   // If it is, zero is inserted into the current element of the new array.
                indexNewArray++;                                                 // All other zeros will be skipped as duplicates.
            }
            if (arrayInt[indexOldArray] != 0){                                   // Аdding unique non-zero elements of the original array
                arrayIntResult[indexNewArray] = arrayInt[indexOldArray];         // to the new one.
                indexNewArray++;
            }
            indexOldArray++;
        }

        System.out.println("Old sort array with duplicates zero: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("New sort array: ");
        for (int i = 0; i < arrayIntResult.length; i++) {
            System.out.print(arrayIntResult[i] + " ");
        }

        return arrayIntResult;
    }
}
