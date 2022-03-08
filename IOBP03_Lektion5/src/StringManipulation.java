public class StringManipulation {
    public static void main(String[] args) {

        //Umwandlung von pDT in Strings
        int a = 12;
        float f = 1.45f;

        String aString1 = "" + a;
        System.out.println(aString1);
        String fString1 = "" + f;
        System.out.println(fString1);

        String aString2 = String.valueOf(a);
        System.out.println(aString2);
        String fString2 = String.valueOf(f);
        System.out.println(fString2);

        //Umwandlung von Strings in pDT
        String bString = "false";
        boolean bool = Boolean.parseBoolean(bString);
        if(bool){
            System.out.println("Bool ist TRUE.");
        }
        else System.out.println("Bool ist FALSE.");

        String byteString = "127";
        byte byt = Byte.parseByte(byteString);
        System.out.println("BYTE: " + byt);

        String floatString = "1.456";
        float fl = Float.parseFloat(floatString);
        System.out.println("FLOAT: " + fl);

        //String-Analyse
        String analyseText = "2022-03-08_RKK_Apolda_001.csv";
        System.out.println("ANALYSETEXT: " + analyseText);

        //Datum extrahieren
        int datumEnde = analyseText.indexOf("_");
        String datumRaw = analyseText.substring(0,datumEnde);
        System.out.println("DATUM: " + datumRaw);

        //Datum manipulieren
        String year = datumRaw.substring(0,datumRaw.indexOf("-"));
        String month = datumRaw.substring(datumRaw.indexOf("-") + 1, datumRaw.lastIndexOf("-"));
        String day = datumRaw.substring(datumRaw.lastIndexOf("-") + 1);
        System.out.println("YEAR: " + year);
        System.out.println("MONTH: " + month);
        System.out.println("DAY: " + day);

        //Firmenname extrahieren
        int firmaStart = analyseText.indexOf("_");
        int firmaEnde = analyseText.lastIndexOf("_");
        String firmaNameRaw = analyseText.substring(firmaStart + 1, firmaEnde);
        String firmaNameClean = firmaNameRaw.replace("_", " ");
        System.out.println("FIRMENNAME: " + firmaNameClean);





    }
}
