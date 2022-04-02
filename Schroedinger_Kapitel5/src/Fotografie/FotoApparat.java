package Fotografie;

public class FotoApparat {

    public static final int MIN_BRENNWEITE = 10;
    public static final int MAXBRENNWEITE = 270;

    private int megaPixel;
    private double displayGroesse;
    private boolean bildStabilisiert;
    private String marke;
    private String herstellungsLand;
    private Objektiv objektiv;
    public FotoApparat(){

    }

    public FotoApparat(int megaPixel, double displayGroesse, boolean bildStabilisiert, String marke, int brennweiteMin, int brennweiteMax, String herstellungsLand) {
        this.megaPixel = megaPixel;
        this.displayGroesse = displayGroesse;
        this.bildStabilisiert = bildStabilisiert;
        this.marke = marke;
        this.objektiv.setBrennweiten(brennweiteMin, brennweiteMax);
        this.herstellungsLand = herstellungsLand;
    }

    //Getter und Setter
    public int getMegaPixel() {
        return megaPixel;
    }

    public void setMegaPixel(int megaPixel) {
        this.megaPixel = megaPixel;
    }

    public double getDisplayGroesse() {
        return displayGroesse;
    }

    public void setDisplayGroesse(double displayGroesse) {
        this.displayGroesse = displayGroesse;
    }

    public boolean isBildStabilisiert() {
        return bildStabilisiert;
    }

    public void setBildStabilisiert(boolean bildStabilisiert) {
        this.bildStabilisiert = bildStabilisiert;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getHerstellungsLand() {
        return herstellungsLand;
    }

    public void setHerstellungsLand(String herstellungsLand) {
        this.herstellungsLand = herstellungsLand;
    }


    //Methoden
    public void machFoto(){
        System.out.println("Klick");
    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    @Override
    public String toString() {
        return "FotoApparat{" +
                "megaPixel=" + megaPixel +
                ", displayGroesse=" + displayGroesse +
                ", bildStabilisiert=" + bildStabilisiert +
                ", marke='" + marke + '\'' +
                ", brennweiteMin=" + objektiv.getBrennweiteMin() +
                ", brennweiteMax=" + objektiv.getBrennweiteMax() +
                ", herstellungsLand='" + herstellungsLand + '\'' +
                '}';
    }


}
