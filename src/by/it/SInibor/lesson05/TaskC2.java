package by.it.SInibor.lesson05;

/*
123
352
436
1343
254
6353
54235
234
-123
232
54
-1231
2343
-1233423
25324
242
-674
2434
-1334523
-125
-123167
Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskC2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            String x = reader.readLine();
            list[i] = Integer.parseInt(x);
        }
        sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }


    private static void sort(int[] array) {
        int size = 20;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    int k = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = k;
                }
            }
        }
    }

}
