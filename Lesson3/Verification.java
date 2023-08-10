package lesson3;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

class Verification  {

    static String[] shablon() {
        String[] shablon = { "Фамилия", "Имя", "Отчество", "дата рождения", "телефон", "пол" };
        return shablon;
    }

    public static void proverka(String[] data) {
        String[] shablon = shablon();
        if (data.length > shablon.length) {
            System.out.println("Проверте себя, введено больше чем положено");
            Utility.start();
        }
        if (data.length < shablon.length) {
             System.out.println( "Проверте себя, введено меньше чем положено ");
            Utility.start();
           
        }
        if(data.length==6){
            CheckError.parseStr(data[0]);
            CheckError.parseStr(data[1]);
            CheckError.parseStr(data[2]);
            CheckError.checkBirthdayChar(data[3]);
        // String lastName = data[0];
        // CheckError.parseStr(lastName);
    
        // String firstName = data[1];
        // String middleName = data[2];
        //Date dateOfBirth=parseDate(data[3]);
        CheckError.checkIntChar(data[4]);
        CheckError.checkGenderChar(data[5]);
        // char gender = data[5].charAt(0);

        // for(int i=0; i<data.length; i++){
        //     if(i<3){
        //         Data.checkStringArch(data[i]);
        //     }
        //     if(i==3){
        //         Data.checkBirthdayChar(data[i]);}
        //     if(i==4){
        //              Data.checkIntChar(data[i]);}
        //     if(i==5){
        //         Data.checkGenderChar(data[i]);}
        // }
        
        // }else{
        //     throw new ArrayStoreException("Вы ввели не все данные или\n" +
        //             "Вы пропустили пробел");
         }
        

    }

    // public static String proverka() {
    // return null;
    // }

}
