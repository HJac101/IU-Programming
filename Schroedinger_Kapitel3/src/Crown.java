public class Crown {
    public static void main(String[] args) {

        final int breite = 7;
        final int haelfteBreite = (breite-1)/2;
        final int hoehe = haelfteBreite;
        final int letzteReihe = hoehe-1;
        for(int i = 0; i<hoehe; i++){
            for(int j = 0; j<breite; j++){
                switch (i){
                    case 0:
                        if(j==0 || (j==haelfteBreite) || j==breite-1){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case letzteReihe:
                        System.out.print(8);
                        break;
                    default:
                        System.out.print((j<i || (j>haelfteBreite-i && j<haelfteBreite+i) || j>=breite-i) ? 0 : " ");
                }
            }
            System.out.println();
        }
    }
}
