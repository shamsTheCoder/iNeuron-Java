public class M {
    public static void main(String[] args){
        int row = 9;
        int col = 9;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (j == 0 || j == col-1 || (i == j || i + j == row-1) && i < 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
