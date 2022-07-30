public class QuesFourHut {
    public static void main(String[] args){

        // TODO: 30-07-2022 Assignment 1: Question 4 
        int col = 25;
        int row = 25;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if ((j == 0 && i >= row/2 -1) || (j == col-1 && i >= row/2 - 1) || i >= row-2 ||  i - j >= row/2 - 1 || ( i + j >= col+col/2-2)){
                    System.out.print("*");
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
