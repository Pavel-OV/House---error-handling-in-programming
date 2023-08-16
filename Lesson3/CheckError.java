package lesson3;


import java.lang.NumberFormatException;

public class CheckError {
     

    public static String parseStr(String data) {
        String stoka = data.replaceAll("[^A-Za-zА-Яа-я]", "");
        if (!stoka.equals(data)) {
            System.out.println("\nОшибка: в ФИО присуствует цифра либо какой-то знак \t" + data);
            System.out.println("\nИсправте данные ФИО: " + data);

            data = parseStr(Utility.inputStroka());

        }
        return data;

    }

    public static String checkBirthdayChar(String data) {
        if (data.matches("^\\d{2}\\.\\d{2}\\.\\d{4}")) {

        } else {
            System.out.println("\nНе правильно набрана дата рождения. \nПроверте введённые данные:  \t" + data + "\n");
            data = checkBirthdayChar(Utility.inputStroka());

        }
        return data;

    }

    public static String checkIntChar(String phone) throws NumberFormatException {
        if (phone.matches("^\\d{10}")) {

        } else {
            System.out.println("\nНе правильно набран номер телефона. \nПроверте введённые данные:  \t" + phone + "\n");
            phone = checkIntChar(Utility.inputStroka());
        }
        return phone;

    }

    public static String checkGenderChar(String gender) {
        if (gender.matches("[fmFM{1}]")) {

        } else {
            System.out.println("\nНе правильно набран пол человека. \nПроверте введённые данные:  \t" + gender);
            System.out.println("Пол набирается латиницей m или f \n");
            gender = checkGenderChar(Utility.inputStroka());

        }
        return gender;

    }
}
