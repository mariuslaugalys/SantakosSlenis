import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main (String [] args) {
       //Old (legacy) way
        long timeNow = System.currentTimeMillis();

        Date d = new Date(timeNow);
        System.out.println(d);

        Date d2 = new Date (Long.MAX_VALUE);
        System.out.println(d2);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d2);

        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));

        //New way
        LocalDateTime dt1 = LocalDateTime.now();
        ZonedDateTime dt2 = ZonedDateTime.now();
        ZonedDateTime dt3 = ZonedDateTime.of(dt1, ZoneId.of("Hongkong"));
        ZonedDateTime dt4 = dt2.withZoneSameInstant(ZoneId.of("Hongkong"));
        LocalDateTime dt5 = LocalDateTime.parse("2019-06-16T16:00");
        Duration timeBetween = Duration.between(dt1, dt4);
        LocalDateTime dt6 = LocalDateTime.now();
        LocalDateTime dt7 = LocalDateTime.parse("1986-03-04T00:00");
        Duration myAge = Duration.between(dt7, dt6);
        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5.plusWeeks(3));
        System.out.println(timeBetween.toMinutes());
        System.out.println(dt6);
        System.out.println(dt7);
        System.out.println(myAge.toDays());
    }
}
