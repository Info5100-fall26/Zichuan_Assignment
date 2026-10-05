public class APP {
    public static void main(String[] args) {
        int[][] a = {
            {2,3,4},
            {3,4,5}
        };
        int[][] b = {
            {1,2},
            {3,4},
            {5,6}
            
        };
        if (a[0].length == b.length){
            int [][]result = new int[a.length][b[0].length];

            for(int i = 0; i < a.length; ++i){
                for(int j = 0; j < b[0].length; ++j){
                    for(int k = 0; k < a[i].length; ++k ){
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
                System.out.println("Result:");
                for(int i = 0; i < result.length; ++i){
                    for(int j = 0; j < result[i].length; ++j){
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            }

        else{
            System.out.println("The matrices cannot be multipilied.");
        }

    }
}
