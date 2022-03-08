import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datum {
    public static void main(String[] args) throws ParseException {

        //Datum mit Manipulation ABER DEPRECATED
        Date datum1 = new Date();
        System.out.println("Vorher: " + datum1);
        datum1.setMonth(datum1.getMonth() + 6);
        System.out.println("Nachher: " + datum1);

        //SimpleDateFormat Date to String

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Date datum2 = new Date();
        String formatiertesDatum = sdf.format(datum2);
        System.out.println("DATUM FORMATIERT: " + formatiertesDatum);

        //SimpleDateFormat String to Date Parsen > ACHTUNG braucht ParseException!
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
        String datumString = "31.12.2021";
        Date datum3 = sdf2.parse(datumString);

        //DateFormat
        Date datum4 = new Date();
        DateFormat df;

        df = DateFormat.getDateInstance();
        System.out.println(df.format(datum4));
        df = DateFormat.getTimeInstance(DateFormat.LONG);
        System.out.println(df.format(datum4));
        df = DateFormat.getDateTimeInstance();
        System.out.println(df.format(datum4));
    }
}
