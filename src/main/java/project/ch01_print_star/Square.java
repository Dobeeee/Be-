package project.ch01_print_star;

public class Square {

    public static void main(String[] args) {

        /**

         정사각형 별찍기가
         ****
         ****
         ****
         ****
         ****

         */
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
