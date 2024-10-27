import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1 test
        int year = 2022;
        int year2 = 2024;
        isLeapYear(year);
        isLeapYear(year2);
        int clientOS = 0;
        int clientOS2 = 1;
        checkDeviceVersion(year,clientOS);
        checkDeviceVersion(year2,clientOS2);
        int deliveryDistance = 115;
        int deliveryDistance2 = 45;
        System.out.println(countDeliveryTime(deliveryDistance));
        System.out.println(countDeliveryTime(deliveryDistance2));


    }
    //task1
    public static void isLeapYear (int year){
        boolean isYearLeap = (((year-1584)%4==0)||((year-1584)%400==0))&&((year-1584)%100!=0);
        if (isYearLeap){
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    //task2
    public static void checkDeviceVersion (int deviceYear, int clientOS) {
        if ((deviceYear < LocalDate.now().getYear())&&clientOS == 1) System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        else if ((deviceYear == LocalDate.now().getYear())&&clientOS == 1) System.out.println("«Установите версию приложения для Android по ссылке»");
        else if ((deviceYear < LocalDate.now().getYear())&&clientOS == 0) System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        else if ((deviceYear == LocalDate.now().getYear())&&clientOS == 0) System.out.println("«Установите версию приложения для iOS по ссылке»");
    }

    //task3
    public static int countDeliveryTime (int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) days = 1;
        else if (deliveryDistance > 20 && deliveryDistance <= 60) days = 2;
        else if (deliveryDistance > 60 && deliveryDistance <= 100) days = 3;
        return days;

    }
}