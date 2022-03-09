import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalender {
    public static void main(String[] args) {

        //Calendar Objekt erstellen
        GregorianCalendar kalender1 = new GregorianCalendar();
        System.out.println(kalender1);

        kalender1.set(Calendar.YEAR, 2022);
        kalender1.set(Calendar.MONTH, Calendar.AUGUST);
        kalender1.set(Calendar.DAY_OF_MONTH, 24);

        System.out.println(kalender1);

        int jahr = kalender1.get(Calendar.YEAR);
        int monat = kalender1.get(Calendar.MONTH);
        int tag = kalender1.get(Calendar.DAY_OF_MONTH);

        System.out.println(jahr + "." + monat + "." + tag);

        GregorianCalendar passwortänderung = new GregorianCalendar();
        passwortänderung.roll(Calendar.MONTH, 6);
    }
}
