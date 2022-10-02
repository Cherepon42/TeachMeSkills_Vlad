package src;

import java.util.Random;

public class HW_3 {
    public static void main(String[] args) {

        // 1.1
        int monthNumber = new Random().nextInt(1, 12);
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Wrong data");
        }

        // 1.2
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Зима");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Весна");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Лето");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Wrong data");
        }
    }
}
