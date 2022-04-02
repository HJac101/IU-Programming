package Bibliothek;

public class Buch {
    //Klassenvariablen
    public static final int MIN_SEITENZAHL = 49;
    public static final int MAX_SEITENZAHL = 50560;

    //Objektvariablen
    private String titel;
    private String author;
    private int seitenZahl;
    private boolean gebundenesBuch;

    //Konstruktoren
    public Buch(){

    }

    public Buch(String titel, String author, int seitenZahl, boolean gebundenesBuch) {
        this.titel = titel;
        this.author = author;
        this.seitenZahl = seitenZahl;
        this.gebundenesBuch = gebundenesBuch;
    }

    //Getter Setter
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSeitenZahl() {
        return seitenZahl;
    }

    public void setSeitenZahl(int seitenZahl) {
        if(MIN_SEITENZAHL<=seitenZahl && MAX_SEITENZAHL>=seitenZahl){
            this.seitenZahl = seitenZahl;
        } else {
            System.err.println("Die Seitenzahlen sind nicht korrekt angegben! Beachten Sie die Grenzwerte!");
        }

    }

    public boolean isGebundenesBuch() {
        return gebundenesBuch;
    }

    public void setGebundenesBuch(boolean gebundenesBuch) {
        this.gebundenesBuch = gebundenesBuch;
    }

    //Methoden
    public void lesen(){
        System.out.println(titel + " von " + author + " wollte ich schon immer mal lesen!");
    }

}
