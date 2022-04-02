public class StringMorseCode {
    public static void main(String[] args) {

        String zuTestendesWort = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";
        String wortKlein = zuTestendesWort.toLowerCase();
        System.out.println(wortKlein);

        for (int x = 0; x < wortKlein.length(); x++) {
            char zeichen = wortKlein.charAt(x);
            switch (zeichen) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print("-");
                    break;
                default:
                    System.out.print(".");
            }
        }
    }
}
