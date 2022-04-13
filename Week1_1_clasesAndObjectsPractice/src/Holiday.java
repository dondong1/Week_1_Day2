import java.util.Arrays;

public class Holiday {

    //members
    private String name;

    public int getDay() {
        return day;
    }

    private int day;
    private String month;

    //constructor
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }


    public static boolean inSameMonth(Holiday holiday1, Holiday holiday2){
        return holiday1.month.equals(holiday2.month);
    }

    public double avgDate(Holiday[] holidays) {
        return Arrays.stream(holidays).mapToDouble(Holiday::getDay).average().getAsDouble();
    }
//    public double avgDate(Holiday[] holidays) {
//        return Arrays.stream(holidays).average()
//    }
    public static Holiday independenceDay = new Holiday("Independence Day", 4, "July");

    public static void main(String[] args) {
        Holiday A1 = new Holiday("US Labor day", 4, "August");
        Holiday holiday = new Holiday("Canada Labor Day", 4, "May");
        System.out.println("The Us labor Day in the same month with Canada Labor Day: " + inSameMonth(A1, holiday));

        Holiday[] holidays = {
                new Holiday("X-mas", 10, "January"),
                new Holiday("New Year", 15, "March"),
                new Holiday("Weekend", 20, "Apirl"),
        };

        double average = Holiday.independenceDay.avgDate(holidays);
        System.out.println("Average of Holiday is " + String.valueOf(average));

    }
}
