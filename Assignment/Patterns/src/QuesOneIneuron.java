public class QuesOneIneuron {
    public static void main(String[] args){

        // TODO: 30-07-2022 Assignment 1: Question 1
        int row = 9;
        int col = 9;

        // TODO: 29-07-2022 printing 'I'
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){

                if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print(" ");

            // TODO: 29-07-2022 printing 'N'
            for (int j = 0; j <col; j++){

                if ((j == 0 || j == col-1) || i == j) {
                    System.out.print(" *");
                }
                else
                    System.out.print("  ");
            }

            System.out.print("      ");

            // TODO: 29-07-2022 printing 'E'
            for (int j = 0; j < col; j++){
                if (j == 0 || i == 0 || i == row/2 || i == row-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("      ");

            // TODO: 29-07-2022 printing 'U'
            for (int j = 0; j < col; j++){
                if (j == 0 && i != row-1 || i == row-1 && j != 0 && j != col-1 || j == col-1 && i != row-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("      ");

            // TODO: 29-07-2022 printing 'R'
            for (int j = 0; j < col; j++){
                if (j == 0 || (i == 0 || i == row/2) && j != col-1 || (j == col-1  && i != 0 && i != row/2 && i < row/2 ) || (i > row/2 && i == j))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("   ");

            // TODO: 29-07-2022 printing 'O'
            for (int j = 0; j < col; j++){
                if (((j == 0 || j == col-1) && i != 0 && i != row-1) || ((i == 0 || i == row-1) && j != 0 && j != col-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("   ");
            // TODO: 29-07-2022 printing 'N'
            for (int j = 0; j <col; j++){

                if ((j == 0 || j == col-1) || i == j) {
                    System.out.print(" *");
                }
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

    }
}
