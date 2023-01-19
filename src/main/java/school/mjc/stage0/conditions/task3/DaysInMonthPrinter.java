package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        String days;
        if (month < 1 || month > 12) {
            days = "wrong number!";
        } else if (month == 2) {
            days = "28";
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = "31";
        } else {
            days = "30";
        }
        System.out.println(days);
    }
}
