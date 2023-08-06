package Lesson1;
// Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
//  и возвращающий новый массив с,
//   каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.

// Если длины массивов не равны - верните нулевой массив длины 1.

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
      // Введите свое решение ниже
      
      if(a.length != b.length){
        int[] d =new int[]{0};
        
        return d;
      }
      int[] d =new int[a.length];
      
      for(int i=0; i<a.length; i++){
        if(b[i] == 0){
          throw new RuntimeException("Делить на 0 нельзя");
        }
        d[i]= a[i]/b[i];
      }
      return d;

       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3{ 
    public static void main(String[] args) { 
         
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
   
      int[] a = {};
      int[] b = {};
      try{
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{4, 5, 6};
        b = new int[]{1, 2 };
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }   
       
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.divArrays(a, b));     
      System.out.println(itresume_res);
    } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}