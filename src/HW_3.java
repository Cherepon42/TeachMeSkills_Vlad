package src;

public class HW_3 {
    public static void main(String[] args) {

        // 1.1
        int monthNumber = 1;
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 5, 4 -> System.out.println("Весна");
            case 6, 8, 7 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Wrong data");
        }
    }
}
