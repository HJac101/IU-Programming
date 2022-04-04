public class PrimeCounting {
    public static void main(String[] args) {

        for(int i=1; i<10000;i++){
            boolean istPrime = true;
            for(int j=2; j<i;j++){
                if(i%j==0){
                    istPrime = false;
                    break;
                }
            }
            if(istPrime){
                System.out.println(i);
            }
        }
    }
}
