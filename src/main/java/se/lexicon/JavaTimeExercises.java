package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaTimeExercises {
    public JavaTimeExercises(){

    }

    public void testLocalDate(){
        LocalDate ld = LocalDate.now();
        System.out.println(ld.toString());
    }

    public void testPrettyPrint(){
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dtf.format(LocalDate.now()));
    }

    public void importDate(){
        LocalDate lastMonday = LocalDate.of(2022,06,20);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dtf.format(lastMonday));

    }

}
