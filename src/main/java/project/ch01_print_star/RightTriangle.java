package project.ch01_print_star;

public class RightTriangle {

    public static void main(String[] args) {
//           *
//          **
//         ***
//        ****
    /*
      if (int c = 0 ; c < b-1 ; c++){

    }

     */
              //  a 0 1 2 3 , b 1 2 3


    for (int a = 0 ; a < 4 ; a++){
        for (int b = 0; b < a+1; b++){
            System.out.print("*");
        }
        System.out.println("");
    }


    }
}
