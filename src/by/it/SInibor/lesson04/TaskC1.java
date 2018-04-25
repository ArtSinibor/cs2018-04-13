package by.it.SInibor.lesson04;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$");
        double i = scan.nextInt();
        if (i < 300 | i > 3000) System.out.println("Мы вам перезвоним!");
        else {
            for (int mount = 0; mount <= 14; mount++) {
                if (mount == 0 | mount == 13 | mount == 14) System.out.println("За " + month(mount) + "начислено $0.0");
                else if (i * 1.5 == 666) {
                    System.out.println("За " + month(mount) + "начислено $" + i * 1.5);
                    break;
                } else if (mount == 6 | mount == 7 | mount == 8) {
                    if (i == 666) {
                        System.out.println("За " + month(mount) + "начислено $" + i);
                        break;
                    } else
                        System.out.println("За " + month(mount) + "начислено $" + i);
                } else {
                    System.out.println("За " + month(mount) + "начислено $" + i * 1.5);
                }
            }
        }
    }

    private static String month(int a) {
        String nad = null;
        if (a == 0 | a == 13 | a == 14) nad = "месяц " + a + " ";
        if (a == 1) nad = "январь ";
        if (a == 2) nad = "февраль ";
        if (a == 3) nad = "март ";
        if (a == 4) nad = "апрель ";
        if (a == 5) nad = "май ";
        if (a == 6) nad = "июнь ";
        if (a == 7) nad = "июль ";
        if (a == 8) nad = "август ";
        if (a == 9) nad = "сентябрь ";
        if (a == 10) nad = "октябрь ";
        if (a == 11) nad = "ноябрь ";
        if (a == 12) nad = "декабрь ";
        return nad;
    }

}
/*
if (oklad <300 || oklad >3000)
sout(мы вам)
else
for (int month = 0; month <=14; month++){
float pay=0;
if (month >0 && <13)
pay = oklad*1.5;
if(month>5 $$ month <9)
pay=oklad;
swith (month) {
case 1:sout("за январь начислено $"+pay); break;
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
case 9:
case 10:
case 12:
default: sout("За месяц" + month + " начислено $" +pay); break;
}
if (pay = 666) break;
 */