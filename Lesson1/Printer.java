package Lesson1;
class Answer {
    public static void arrayOutOfBoundsException() {
      int a = (new int[5])[5];
       
      
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
      int d=6;
      int f=0;
      int r=d/f;
      
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
      int d= Integer.parseInt("Данные: ");
       
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}