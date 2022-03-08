public class Splitter {
    public static void main(String[] args) {
        String zeile1 = "'bah90131','Titel 1','Hersteller 1','12,56'";

        //Aufteilung ohne Cleaning
        String aufteilung[];
        aufteilung = zeile1.split("'.'");

        for (String wert : aufteilung){
            System.out.println(wert);
        }

        //Aufteilung mit Cleaning

        String zeileClean = zeile1.substring(zeile1.indexOf("'") + 1,zeile1.lastIndexOf("'"));
        System.out.println(zeileClean);
        String aufteilungClean[] = zeileClean.split("','");
        for(String wert : aufteilungClean){
            System.out.println(wert);
        }
        String artikelnummer = aufteilungClean[0];
        String titel = aufteilungClean[1];
        String hersteller = aufteilungClean[2];
        float preis = Float.parseFloat(aufteilungClean[3].replace(",","."));
        System.out.println("Korrigiertes Preisformat: " + preis);
    }
}
