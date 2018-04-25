package by.it.SInibor.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ONE1");
        list.add("ONE2");
        list.add("ONE3");
        list.add("ONE4");
        list.add("ONE5");
        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
    }
}
