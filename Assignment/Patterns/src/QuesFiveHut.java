public class QuesFiveHut {
    public static void main(String[] args){
        // TODO: 30-07-2022 Assignment 1: Question 5
        int col = 14;
        int row = 14;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (i == 0 || j == 0 || i == row - 1 || i + j <= row / 2 || i - j >= row / 2 - 1){
                    System.out.print("*");
                    System.out.print(" ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
