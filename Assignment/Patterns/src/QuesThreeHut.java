public class QuesThreeHut {
    public static void main(String[] args){
        // TODO: 30-07-2022 Assignment 1: Question 3
        int col = 25;
        int row = 25;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1 || i + j < row / 2  || (j - i >= col/2))  {
                    System.out.print("*");
                    System.out.print(" ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
