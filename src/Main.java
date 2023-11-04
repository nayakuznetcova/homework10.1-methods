import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2023;
        checkIsLeapYear(year);

        System.out.println("Задача 2");
        printOSVersion(0, 2020);

        System.out.println("Задача 3");
        int delivery = deliveryTime(65);
        if (delivery > 0) {
            System.out.println("На доставку потребуется " + delivery + " дней");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void checkIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void printOSVersion(int os, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Облегченная iOS версия");
            } else if (deviceYear == currentYear) {
                System.out.println("Обычная iOS версия");
            }
        } else if (os == 1) {
            if (deviceYear < currentYear) {
                System.out.println("облегченная Android версия");
            } else if (deviceYear == currentYear) {
                System.out.println("Обычная Android версия");
            }
        }
    }

    public static int deliveryTime(int deliveryDistance) {
        if (deliveryDistance < 0) {
            return -1;
        } else if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}