package Bibliothek;

public class BuchMesse {
    public static void main(String[] args) {
        Buch buch = new Buch();
        buch.setTitel("Romeo und Julia");
        buch.setAuthor("William Shakespear");
        buch.setSeitenZahl(400);
        buch.setGebundenesBuch(false);
        buch.lesen();
    }
}
