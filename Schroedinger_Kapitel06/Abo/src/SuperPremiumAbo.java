public class SuperPremiumAbo extends PremiumAbo{
    public SuperPremiumAbo(Abonnent abonnent){
        super(abonnent);
        System.out.println("Neues Super-Premium-Abo");
    }
    @Override
    public double getPreisProJahr(){
        return super.getPreisProJahr() *2;
    }
}
