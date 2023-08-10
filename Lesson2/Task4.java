package lesson2;


import java.util.Scanner;

public class Task4 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит
    // пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();

        try {
            if (!input.matches("\\S+")) {
                throw new Exception("Пустые строки вводить нельзя!");
            } else {
                System.out.println("Вы ввели: " + input);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}