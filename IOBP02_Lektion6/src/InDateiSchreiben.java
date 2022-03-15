import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InDateiSchreiben {
    public static void main(String[] args) {

        //SimpleDateFormat festlegen
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmssSSS-ddMMyyyy");

        //Pfad festlegen
        String sep = File.separator;
        String pfad = "C:" + sep + "Wichtiges" + sep + "Java_File_Test" + sep + sdf.format(new Date()) + ".log";
        File datei = new File(pfad);
        System.out.println(pfad);

        //In Datei schreiben
        try{
            FileWriter fileWriter = new FileWriter(datei);
            fileWriter.write(sdf.format(new Date()));
            fileWriter.close();
        } catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
