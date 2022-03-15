import java.io.*;

public class Einlesen {
    public static void main(String[] args) {

        //Pfad definieren und File-Obj anlegen
        String sep = File.separator;
        String pfad = "C:" + sep + "Wichtiges" + sep + "Java_File_Test" + sep + "test_file.txt";
        //System.out.println(pfad);
        File datei = new File(pfad);

        try {

            //FileReader anlegen und File-Obj übergeben
            FileReader fr = new FileReader(datei);
            //BufferedReader anlegen und FileReader-Obj übergeben
            BufferedReader br = new BufferedReader(fr);
            //For-Schleife anlegen > Zeile zum einlesen definieren > Zeile ist Ausgabe von br.readLine()
            //Laufen solange zeile != null > Weiter zu nächster Zeile > Zeile bearbeiten
            for(String zeile = br.readLine(); zeile != null; zeile = br.readLine()){
                System.out.println(zeile);
            }
            //FileReader und BufferedReader schließen
            br.close();
            fr.close();

        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
