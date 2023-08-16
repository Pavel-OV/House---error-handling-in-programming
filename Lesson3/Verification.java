package lesson3;

class Verification  {

    static String[] shablon() {
        String[] shablon = { "Фамилия", "Имя", "Отчество", "дата рождения", "телефон", "пол" };
        return shablon;
    }

    public static String[] proverka(String[] data) {
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
            data[0]= CheckError.parseStr(data[0]);
            data[1]= CheckError.parseStr(data[1]);
            data[2]= CheckError.parseStr(data[2]);
            data[3]= CheckError.checkBirthdayChar(data[3]);
            data[4]= CheckError.checkIntChar(data[4]);
            data[5]= CheckError.checkGenderChar(data[5]);
        }
        return data;

    }



}
