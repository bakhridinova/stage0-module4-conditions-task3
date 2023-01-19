package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String season;
        if (month < 1 || month > 12) {
            season = "wrong number!";
        } else if (month > 2 && month < 6) {
            season = "Spring";
        } else if (month > 5 && month < 9) {
            season = "Summer";
        } else if (month > 8 && month < 12) {
            season = "Autumn";
        } else {
            season = "Winter";
        }
        System.out.println(season);
    }
}
