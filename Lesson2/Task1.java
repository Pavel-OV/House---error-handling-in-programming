package lesson2;

import java.util.Scanner;

import java.util.Locale;

public class Task1 {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // (типа float), и возвращает введенное значение.
    // Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        System.out.println(inputDouble());
        System.out.println("Отлично");

    }

    public static Double inputDouble() {
        System.out.println("Введите дробное число");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String input = sc.next();
        while (!input.matches("^\\d*\\.\\d+$")) {
            System.out.print("Ошибка: введите в формате дробного числа: ");
            input = sc.next();
        }
        return Double.parseDouble(input);
    }

}
