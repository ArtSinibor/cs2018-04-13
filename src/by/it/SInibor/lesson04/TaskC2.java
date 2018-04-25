package by.it.SInibor.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(mountNum(m) + d);
    }

    private static int mountNum(int m) {
        int dm[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + dm[i];
        }
        return sum;
    }
}
