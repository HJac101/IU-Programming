public class TestArray {
    public static void main(String[] args) {

        int []  vector;
        vector = new int[]{1,2,3,4,5};
        for(int i : vector){
            System.out.println(i);
        }

        int[][] matrix = new int[][]{{1,2,3},
                                     {4,5,6},
                                     {7,8,9}};

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}