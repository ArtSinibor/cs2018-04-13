package by.it.SInibor.lesson05;
/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> spiso = new ArrayList<>();
        ArrayList<Integer> spis2 = new ArrayList<>();
        ArrayList<Integer> spis3 = new ArrayList<>();
        ArrayList<Integer> spise = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            String x = reader.readLine();
            spiso.add(Integer.parseInt(x));
        }
        for (Object aSpiso : spiso) {
            Integer x = (Integer) aSpiso;
            if (x % 3 == 0) spis3.add(x);
        }
        for (Object aSpiso : spiso) {
            Integer x = (Integer) aSpiso;
            if (x % 2 == 0) spis2.add(x);
        }
        for (Object aSpiso : spiso) {
            Integer x = (Integer) aSpiso;
            if (x % 3 != 0 && x % 2 != 0) spise.add(x);
        }

/*          if (x % 3 == 0) spis3.add(x);
            if (x % 2 == 0) spis2.add(x);
            if (x % 3 != 0 && x % 2 != 0) spise.add(x);*/
        printList(spis3);
        printList(spis2);
        printList(spise);
    }


    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
