public class Abo {

    private Abonnent abonnent;
    private double preisProJahr = 20.0;

    public Abo(Abonnent abonnent){
        System.out.println("Neues Abo");
        this.abonnent = abonnent;
    }
    public double getPreisProJahr(){
        return this.preisProJahr;
    }

    public Abonnent getAbonnent() {
        return abonnent;
    }
}
