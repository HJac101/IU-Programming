package Katzen;

public class Katzenwahnsinn {

    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            machKatzen(10000);
            warten(5000);
        }
    }

    private static void machKatzen(int anzahl){
        for (int i = 0; i<anzahl; i++){
            Katze katze = new Katze("Katze" + i);
        }
    }

    private static void warten(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
