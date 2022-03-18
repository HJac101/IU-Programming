import java.io.File;
import java.sql.Date;

public class Dateisysteme {

    public boolean verzeichnisAnlegen(){
        String sep2 = File.separator;
        String pfad2 = "C:" + sep2 + "Wichtiges" + sep2 + "Java_File_Test" + sep2 + "Automatisch Erstelltes Verzeichnis" + sep2;
        File verzeichnis2 = new File(pfad2);
        if(verzeichnis2.exists() && verzeichnis2.canWrite()){
            System.out.println("Verzeichnis existiert bereits!");
            return true;
        }
        else {
            System.out.println("Verzeichnis wurde erfolgreich erstellt!");
            return verzeichnis2.mkdirs();
        }
    }

    public boolean verschiebeFile(File datei){
        String sep3 = File.separator;
        String pfad = "C:" + sep3 + "Wichtiges" + sep3 + "Java_File_Test" + sep3 + "Automatisch Erstelltes Verzeichnis" + sep3;
        pfad = pfad + datei.getName();

        File neuerOrt = new File(pfad);
        return datei.renameTo(neuerOrt);
    }

    public static void main(String[] args) {


        //Ausgabe aller Root-Filesysteme
        File[] roots = File.listRoots();
        for(File root:roots){
            System.out.println(root);
            File[] files = root.listFiles();
            for(File file : files){
                System.out.println(file.getAbsolutePath());
            }
        }

/*        String sep = File.separator;
        String pfad = "C:" + sep + "Wichtiges" + sep + "Java_File_Test" + sep + "test_file.txt";
        System.out.println(pfad);

        File verzeichnis = new File(pfad);
        System.out.println(pfad + " existiert: " + verzeichnis.exists());
        System.out.println(pfad + " ist ein Verzeichnis: " + verzeichnis.isDirectory());
        System.out.println(pfad + " ist eine Datei: " + verzeichnis.isFile());
        System.out.println(pfad + " kann gelesen werden: " + verzeichnis.canRead());
        System.out.println(pfad + " kann geändert werden: " + verzeichnis.canWrite());
        System.out.println(pfad + " Anzahl Bytes: " + verzeichnis.length() + " bytes");
        System.out.println(pfad + " Änderungsdatum: " + (new Date(verzeichnis.lastModified())));
*/
        // Dateisysteme ds = new Dateisysteme();
        // ds.verzeichnisAnlegen();

        // ds.verschiebeFile(verzeichnis);


    }
}
