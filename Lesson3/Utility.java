package lesson3;

import java.util.Scanner;

public class Utility{

     static void   info(){
        System.out.println( "Введите через пробел свои данные: ФИО, дату рождения, номер телефона и пол");
        System.out.println("Форма ввода:\n ФИО - строки\n дата рождения - dd.mm.yyyy\n номер телефона -  целое безнаковое число без форматирования\n пол - символами латиницей f или m ");
    }
    public static  String inputStroka(){

        Scanner sc = new Scanner (System.in);
        System.out.println("Введите данные\n");
        String stroka = sc.nextLine();
       
        return stroka;
    }

}