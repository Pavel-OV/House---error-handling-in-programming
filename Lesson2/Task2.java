package lesson2;
// Если необходимо, исправьте данный код 

//(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)


public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] { 8 };

         try {
        int d = 0;
        double catchedRes1 = intArray[0] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e.getMessage());
        }

    }

}
