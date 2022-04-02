public class Dinkel {
    public static void main(String[] args) {

        String speise = "Dinkelpfannekuchen";

        if (speise != null && speise.startsWith("Dinkel")){
            if ("Dinkelpfannekuchen".equals(speise)){
                speise = "Hamburger";
            } else {
                speise = speise.substring("Dinkel".length());
                speise = "Hamburger" + speise;
            }
        }
        if (speise != null && speise.contains("Salat")){
            speise.replaceAll("Salat", "Pommes");
        }
        System.out.println("Heute gibt es " + speise + " zu essen:");
    }
}
