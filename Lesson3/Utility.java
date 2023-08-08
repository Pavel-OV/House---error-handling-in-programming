package lesson3;

import java.util.Scanner;

public class Utility{
    public static void start(){
        String  stroka;
        info();
        stroka=inputStroka();
        stroka = stroka.replaceAll("\\s+", " ");
        stroka= stroka.trim();
        String[] data = stroka.split(" ");
        //System.out.println( Verification.proverka(data));
        Verification.proverka(data);
        //String proverka=Verification.proverka(data);
        //System.out.println(proverka);

    }

     static void   info(){
        System.out.println( "Введите через пробел свои данные:");
        System.out.println("\nФорма ввода:\n ФИО - строки\n дата рождения - dd.mm.yyyy\n номер телефона -  целое безнаковое число без форматирования\n пол - символами латиницей f или m ");
    }
    public static  String inputStroka(){

        Scanner sc = new Scanner (System.in);
        System.out.println("\nВведите данные");
        String stroka = sc.nextLine();
       
        return stroka;
    }

}