package lesson3;

//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckError {
    private static Pattern p = Pattern.compile("\\d");
    //private static Matcher matcher = p.matcher

    public static void parseStr(String data){
         char[] charString = data.toCharArray();
         boolean isDigit = false;

        for (char c : charString) {
            if(Character.isDigit(c)){
                isDigit=true;
                System.out.println( "В ФИО присуствует цифра");
                Utility.start();        
                             
            }                
        }
        
        
    }

     public static void checkBirthdayChar(String data){
        char[] charString = data.toCharArray();
        
    }
    public static void checkIntChar(String phone) throws NumberFormatException{
        char[] numberChar = phone.toCharArray();
        if(numberChar.length !=10){
            System.out.println("Вы неправильно набрали колличество цифр в номере телефона");
            Utility.start();
            
        }
        try{
            long number = Long.parseLong(phone);
        } catch (NumberFormatException e) {
            System.out.println("В номере телефона присуствует буква(ы)");
            Utility.start();
            
            }
        
    }
   
     public static void checkGenderChar(String data){
        char[] charString = data.toCharArray();
         if(charString.length !=1){
            System.out.println("В графе пол должна быть одна буква");
            Utility.start();

    }
   
}
    
}
