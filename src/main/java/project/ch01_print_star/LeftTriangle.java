package project.ch01_print_star;

public class LeftTriangle {

    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
        for (int c = 0; c < 4; c++) {
            for (int d = 0; d < c+1; d++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
