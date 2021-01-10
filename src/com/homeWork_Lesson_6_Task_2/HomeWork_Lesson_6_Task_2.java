package com.homeWork_Lesson_6_Task_2;

import com.homeWork_Lesson_6_Task_2.arrayOperations.ArrayOperations;

import java.util.Scanner;
/** ЗАДАЧА 2
 * Есть массив целых числел.
 * 	Необходимо удалить дубликаты из массива и отсортировать.
 * 	На вход метод будет получать первоначальный массив,
 * 	на выход метод будет возвращать отсортированный массив без дубликатов.
 *
 * 	Что практикуем в этом задании:
 * 		- построение алгоритмов
 * 		- управляющие конструкции, операции ветвления
 **/
public class HomeWork_Lesson_6_Task_2 {
    public static void main(String[] args) {
        /*
        The array goes through 4 stages:
        1. Initialization.
        2. Removing duplicates (zeroing).
        3. Sorting in increasing order.
        4. Overwriting into a new array with a size equal to the number of unique elements
           (zeros formed in the process of removing duplicates are not transferred to the new array)
        *5* all 4 stages will be displayed on the screen.
                                    Attention!
           The method works on the entire range of Int (negative too)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Fill the array with integers via Enter:");
        for (int i = 0; i < array.length; i++) {                            // array initialize
            array[i] = scanner.nextInt();
        }

        scanner.close();                                                    // closing scanner

        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {                            // print array before operations
            System.out.print(array[i] + "  ");
        }
        System.out.println(" ");

        ArrayOperations.arrayRemoveDuplicatesAndSort(array);
    }
}
