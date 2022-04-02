package Fotografie;

public class Objektiv {

    private int brennweiteMin;
    private int brennweiteMax;

    public Objektiv(int brennweiteMin, int brennweiteMax) {
        this.setBrennweiten(brennweiteMin, brennweiteMax);
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public void setBrennweiten(int brennweiteMin, int brennweiteMax){
        if (brennweiteMin<=brennweiteMax){
            this.brennweiteMin = brennweiteMin;
            this.brennweiteMax = brennweiteMax;
        } else {
            System.err.println("Die Brennweiten angaben sind ungültig! Die minimale Brennweite muss kleiner gleich der maximalen Brennweite sein!");
        }
    }


}
