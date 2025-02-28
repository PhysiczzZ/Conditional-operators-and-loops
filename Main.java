import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = 0;

        while (true) {
            System.out.print("Введите год: ");
            int dpy = daysPerYear(sc.nextInt());
            System.out.print("Введите количество дней: ");
            int days = sc.nextInt();

            if (days == dpy) {
                point++;
            } else {
                System.out.println("Неправильно! В этом году " + dpy + " дней!");
                System.out.println("Набрано очков: " + point);
                break;
            }
        }
    }
    public static int daysPerYear (int year) {
        int days;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            days = 366;
        } else {
            days = 365;
        }
        return days;
    }
}


