public class Wetter {
    public static void main(String[] args) {
        System.out.println(sageWetterVoraus(5, "Marokko"));
    }

    public static String sageWetterVoraus(int monat, String land){
        String vorhersage;
        if ("Deutschland".equals(land)){
            vorhersage = "Absolut nicht vorhersehbar.";
        } else if(monat >=5 && monat <=9){
            vorhersage = "Wahrscheinlich ganz gut.";
        } else {
            vorhersage = "Regen mit Graupel.";
        }
        return vorhersage;
    }

}
