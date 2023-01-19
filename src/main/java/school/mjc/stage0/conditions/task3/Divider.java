package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        String dividable;
        if (number == 0) {
            dividable = "cannot divide by zero";
        } else if (number % 55 == 0) {
            dividable = "Dividable";
        } else {
            dividable = "Non-dividable";
        }
        System.out.println(dividable);
    }
}
