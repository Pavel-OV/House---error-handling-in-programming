package Lesson1;

import java.util.Arrays;
// Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
//  и возвращающий новый массив c, каждый элемент которого равен разности элементов двух 
//  входящих массивов в той же ячейке.

// Если длины массивов не равны - верните нулевой массив длины 1.

// Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

public class Answer2 {
  public static int[] subArrays(int[] a, int[] b) {
    if (a.length != b.length) {
      throw new RuntimeException("Arrays must have the same length");
    }
    int[] itresume_res = new int[a.length];
    for (int i = 0; i < a.length; i++) {

      itresume_res[i] = a[i] - b[i];
    }
    return itresume_res;

  }

  // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
 
    public static void main(String[] args) {
      int[] a = new int[] { 5, 5, 6 };
      int[] b = new int[] { 1, 2, 0 };

      // if (args.length == 0) {
      // // При отправке кода на Выполнение, вы можете варьировать эти параметры
      // a = new int[] { 4, 5, 6 };
      // b = new int[] { 1, 2, 3 };

      // } else {
      // a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
      // b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      // }
      try {
       

        int[] itresume_res = subArrays(a, b);
        
        System.out.println(Arrays.toString(itresume_res));
      } catch (RuntimeException e) {
        System.out.println("Error: " + e.getMessage());
      }

    }
  
}