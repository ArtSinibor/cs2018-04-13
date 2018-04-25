package by.it.SInibor.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:


Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто

0	ноль
1	один
2	два
3	три
4	четыре
5	пять
6	шесть
7	семь
8	восемь
9	девять
10	десять
11	одиннадцать
12	двенадцать
13	тринадцать
14	четырнадцать
15	пятнадцать
16	шестнадцать
17	семнадцать
18	восемнадцать
19	девятнадцать
20	двадцать
30	тридцать
40	сорок
50	пятьдесят
60	шестьдесят
70	семьдесят
80	восемьдесят
90	девяносто
100	сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        int size = 10;
        int str = 0;
        while (str != size) {
            str++;
            for (int stl = 1; stl <= size; stl++) {
                prop(str);
                System.out.print(" умножить на ");
                prop(stl);
                System.out.print(" равно ");
                if ((str * stl) % 10 == 0 | (str * stl) < 20) {
                    prop(str * stl);
                } else {
                    prop((str * stl) / 10 * 10);
                    System.out.print(" ");
                    prop((str * stl) % 10);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static int prop(int num) {
        switch (num) {
            case 1:
                System.out.print("один");
                break;
            case 2:
                System.out.print("два");
                break;
            case 3:
                System.out.print("три");
                break;
            case 4:
                System.out.print("четыре");
                break;
            case 5:
                System.out.print("пять");
                break;
            case 6:
                System.out.print("шесть");
                break;
            case 7:
                System.out.print("семь");
                break;
            case 8:
                System.out.print("восемь");
                break;
            case 9:
                System.out.print("девять");
                break;
            case 10:
                System.out.print("десять");
                break;
            case 11:
                System.out.print("одиннадцать");
                break;
            case 12:
                System.out.print("двенадцать");
                break;
            case 13:
                System.out.print("тринадцать");
                break;
            case 14:
                System.out.print("четырнадцать");
                break;
            case 15:
                System.out.print("пятнадцать");
                break;
            case 16:
                System.out.print("шестнадцать");
                break;
            case 17:
                System.out.print("семнадцать");
                break;
            case 18:
                System.out.print("восемнадцать");
                break;
            case 19:
                System.out.print("девятнадцать");
                break;
            case 20:
                System.out.print("двадцать");
                break;
            case 30:
                System.out.print("тридцать");
                break;
            case 40:
                System.out.print("сорок");
                break;
            case 50:
                System.out.print("пятьдесят");
                break;
            case 60:
                System.out.print("шестьдесят");
                break;
            case 70:
                System.out.print("семьдесят");
                break;
            case 80:
                System.out.print("восемьдесят");
                break;
            case 90:
                System.out.print("девяносто");
                break;
            case 100:
                System.out.print("сто");
                break;
        }
        return num;
    }
}
