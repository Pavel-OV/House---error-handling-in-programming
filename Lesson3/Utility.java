package lesson3;

import java.io.IOException;
import java.util.Scanner;


public class Utility{
    public static void start() throws IOException{
        String  stroka=" ";
        String[] data = new String[6];
        info();
        stroka=inputStroka();
        stroka = stroka.replaceAll("\\s+", " ");
        stroka= stroka.trim();
        data = stroka.split(" ");
       
        Verification.proverka(data);
        SaveFile.createFile(data);
            
    }

     static void   info(){
        System.out.println( "Введите через пробел свои данные:");
        System.out.println("\nФорма ввода:\n ФИО - строки\n дата рождения - dd.mm.yyyy\n номер телефона -  целое безнаковое число без форматирования\n пол - символами латиницей f или m \n");
    }
    public static  String inputStroka(){

        Scanner sc = new Scanner (System.in,  "Cp866");
        System.out.println("Введите данные");
        String stroka = sc.nextLine();
       
        return stroka;
    }

}