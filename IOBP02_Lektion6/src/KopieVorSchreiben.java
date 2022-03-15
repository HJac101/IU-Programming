import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KopieVorSchreiben {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String sep = File.separator;
        String pfad = "C:"+ sep + "Wichtiges" + sep + "Java_File_Test" + sep + sdf.format(new Date()) + ".log";
        File datei = new File(pfad);

        try {
            if(datei.exists()){
                File dateiKopie = new File(datei.getAbsolutePath()+ ".kopie");

                FileReader original = new FileReader(datei);
                FileWriter kopie = new FileWriter(dateiKopie);

                for(int zeichen = original.read(); zeichen != -1; zeichen = original.read()){
                    kopie.write(zeichen);
                }
                kopie.close();
                original.close();
            }
            FileWriter fileWriter = new FileWriter(datei);
            fileWriter.write(sdf.format(new Date()));
            fileWriter.close();

        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
