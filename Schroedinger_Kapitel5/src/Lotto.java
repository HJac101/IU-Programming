public class Lotto {
    public static void main(String[] args) {
        lottoZahlen(1,11,34,23,45,6,29);


    }
    public static void lottoZahlen(int z1, int z2, int z3, int z4, int z5, int z6, int z7){
        for (int i = 1; i <= 49; i++){
            if (i == z1 ||i == z2 ||i == z3 ||i == z4 ||i == z5 ||i == z6 ||i == z7){
                System.out.print("|x| ");
            } else {
                System.out.print("| | ");
            }
            if (i % 7 == 0){
                System.out.println("");
            }
        }
    }
}
