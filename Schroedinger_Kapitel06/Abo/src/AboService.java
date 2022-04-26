public class AboService {
    public static void main(String[] args) {

        Abonnent person = new Abonnent(10);
        Abo abo = new PremiumAbo(person);
        AboPreisBerechner aboPreisBerechner = new AboPreisBerechner();
        System.out.println("ABO: " + aboPreisBerechner.berechnePreisInklusiveRabatt(abo));
    }
}
