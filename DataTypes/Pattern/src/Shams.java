public class Shams {
    public static void main(String[] args){
        int row = 9;
        int col = 9;

        for (int i = 0; i < row; i++){
            // TODO: 23-07-2022 Printing 'S'
            for (int j = 0; j < col; j++){
                if (j == 0 && i != 0 && i != 4 && i != 5 && i != 6 || i == 0 && j != 0 && j != col-1 || i != 0 && j == col-1 && i !=2 && i != 3 && i != 4 && i != row-1  || i == 4 && j != 0 && j != col-1 || i == row-1 && j != 0 && j != col-1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Extra space between to characters
            System.out.print("    ");

            // TODO: 23-07-2022 Printing 'H'
            for (int j = 0; j < col; j++){
                if (j == 0 || j == col-1 || i == row/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Extra space between to characters
            System.out.print("    ");

            // TODO: 23-07-2022 Printing 'A'
            for (int j =0; j < col; j++){
                if (j == 0 && i != 0 || i == 0 && j != 0 && j != col-1 || j == col-1 && i != 0 || i == row/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Extra space between to characters
            System.out.print("    ");

            // TODO: 23-07-2022 Printing 'M'
            for (int j = 0; j < col; j++){
                if (j == 0 || j == col-1 || (i == j || i + j == row-1) && i < 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Extra space between to characters
            System.out.print("    ");

            // TODO: 23-07-2022 Printing 'S'
            for (int j = 0; j < col; j++){
                if (j == 0 && i != 0 && i != 4 && i != 5 && i != 6 || i == 0 && j != 0 && j != col-1 || i != 0 && j == col-1 && i !=2 && i != 3 && i != 4 && i != row-1  || i == 4 && j != 0 && j != col-1 || i == row-1 && j != 0 && j != col-1 )
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }
}
