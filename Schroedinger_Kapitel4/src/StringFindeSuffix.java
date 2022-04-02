public class StringFindeSuffix {
    public static void main(String[] args) {

        String s1 = "Tischlerei";
        String s2 = "Fischerei";

        String gemeinsamesSuffix = "";

        for (int i = s1.length()-1; i >= 0; i--){
            String teilstring = s1.substring(i);
            if(s2.endsWith(teilstring)){
                gemeinsamesSuffix = teilstring;
            } else {
                break;
            }
        }
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Gemeinsames Suffix: " + gemeinsamesSuffix);
    }
}
