import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        /*
        System.out.printf("오늘의 날씨는 %d도 입니다.\n", 8);
        System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.", 'a', 'A');

        double d = 1.2345d;
        System.out.printf("d = %f\n", d);

         */
        /*
        int x = 10;
        int y = 20;
        System.out.println("x =" + x);
        System.out.println("y =" + y);

         */
    /*
        x = y;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
     */
     /*
        System.out.println("x+y=" +(x+y));
        System.out.println("x-y=" +(x-y));
        System.out.println("x*y=" +(x*y));
        System.out.println("x/y=" +(x/y));
        System.out.println("x%y=" +(x%y));
      */
        /*
        int x = 10;
        System.out.println("x +=  10 : " +(x += 10));
        System.out.println("x -=  10 : " +(x -= 10));
        System.out.println("x *=  10 : " +(x *= 10));
        System.out.println("x /=  10 : " +(x /= 10));
        System.out.println("x %=  10 : " +(x %= 10));

         */
/*
        int x = 10;
        int y = 20;
        System.out.println("x > y :" + (x > y));
        System.out.println("x < y :" + (x < y));
        System.out.println("x >= y :" + (x >= y));
        System.out.println("x <= y :" + (x <= y));
        System.out.println("x == y :" + (x == y));
        System.out.println("x != y :" + (x != y));

 */
        /*
        int x =10;
        System.out.println("++x : " + (++x));
        x = 10;
        System.out.println("--x : " + (--x));
        x = 10;
        System.out.println("x++ : " + (x++));
        System.out.println("x : " + x);
        x = 10;
        System.out.println("x-- : " + (x--));
        System.out.println("x : " + x );

         */
/*
        boolean b1 = false;
        boolean b2 = true;
        System.out.println("b1 && b2 :" +(b1 && b2));
        System.out.println("b1 || b2 :" +(b1 || b2));
        System.out.println("!b1 : " + !b1);
        System.out.println("!b2 : " + !b2);

 */
        /*
        int x = 10;
        int y = 20;
        int result = 0;
        result = (x > y) ? 100 : 200;
        System.out.println("result : " + result);
        result = (x < y) ? 100 : 200;
        System.out.println("result :" + result);
        result = (x == y) ? 100 : 200;
        System.out.println("result :" + result);

         */
/*
        int x = 2;
        int y = 3;
        System.out.println("x & y : " +(x & y));
        System.out.println("x | y : " +(x | y));
        System.out.println("x ^ y : " +(x ^ y));

 */
/*
        int [] arr1 = new int[5];
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;
        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[1] : " + arr1[1]);
        System.out.println("arr1[2] : " + arr1[2]);
        System.out.println("arr1[3] : " + arr1[3]);
        System.out.println("arr1[4] : " + arr1[4]);

 */
/*
        int [] arr2 = {10, 20, 30};
        System.out.println("arr2[0] : " + arr2[0]);
        System.out.println("arr2[1] : " + arr2[1]);
        System.out.println("arr2[2] : " + arr2[2]);

 */
/*
        String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
        int[] score = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s의 점수를 입력하시오. :", name[0]);
        score[0] = scanner.nextInt();
        System.out.printf("%s의 점수를 입력하시오. :", name[1]);
        score[1] = scanner.nextInt();
        System.out.printf("%s의 점수를 입력하시오. :", name[2]);
        score[2] = scanner.nextInt();
        System.out.printf("%s의 점수를 입력하시오. :", name[3]);
        score[3] = scanner.nextInt();
        System.out.printf("%s의 점수를 입력하시오. :", name[4]);
        score[4] = scanner.nextInt();

        System.out.printf("%s 점수 : \t%.2f\n", name[0], (double)score[0]);
        System.out.printf("%s 점수 : \t%.2f\n", name[1], (double)score[1]);
        System.out.printf("%s 점수 : \t%.2f\n", name[2], (double)score[2]);
        System.out.printf("%s 점수 : \t%.2f\n", name[3], (double)score[3]);
        System.out.printf("%s 점수 : \t%.2f\n", name[4], (double)score[4]);

        double ave = (double) (score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
        System.out.printf("-----------------------\n평 점 : \t%.2f", ave);

        scanner.close();

        System.out.println();

 */

/*
        int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
        int[] arrAtt2 = null;
        int[] arrAtt3 = null;

        System.out.println("arrAtt1.length : " + arrAtt1.length);
        System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
        arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
        System.out.println("arrAtt1 : " + Arrays.toString(arrAtt3));
        arrAtt2 = arrAtt1;
        System.out.println("arrAtt1 : " + arrAtt1);
        System.out.println("arrAtt2 : " + arrAtt2);
        System.out.println("arrAtt3 : " + arrAtt3);

 */
/*
        int[][] arrMul = new int[3][2];
        arrMul[0][0] = 10;
        arrMul[0][1] = 100;
        arrMul[1][0] = 20;
        arrMul[1][1] = 200;
        arrMul[2][0] = 30;
        arrMul[2][1] = 300;

        System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
        System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
        System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));

 */

/*
        if(num1 < num2) {
            System.out.println("num1는 num2보다 작다.");
        }
            System.out.println();


        if(num1 > num2) {
            System.out.println("num1는 num2보다 작다.");
        }else{
            System.out.println("num1는 num2보다 크거나 같다. ");
            System.out.println();
        }

        if(num1 < num2) {
            System.out.println("num1는 num2보다 작다. ");
        } else if (num1 > num2){
            System.out.println("num1는 num2보다 크다. ");
        } else{
            System.out.println("num1과 num2는 같다.");
        }

 */
        /*
        if (num1 < num2){
            System.out.println("num1은 num2보다 작다. ");
        }
        if (num1 > num2){
            System.out.println("num1은 num2보다 크다.");
        }   else {
            System.out.println("num1은 num2보다 크지 않다.");
        }
        if (num1 > num2){
            System.out.println("num1은 num2보다 크다.");
        }   else if (num1 < num2){
            System.out.println("num1은 num2보다 작다. ");
        }   else if (num1 == num2){
            System.out.println("num1은 num2와 같다. ");
        }   else {
            System.out.println("num1은 num2와 크지도 작지도 않다. ");
        }

         */

/*
        System.out.println("점수를 입력하세요.");

        Scanner inputNum = new Scanner(System.in);
        int score = inputNum.nextInt();

        switch (score) {
            case 90:
                System.out.println("수");

            case 80:
                System.out.println("우");
                break;
            case 70:
                System.out.println("미");

            case 60:
                System.out.println("양");


            default:
                System.out.println("score?");
        }

        inputNum.close();

 */


        /*
        System.out.println("INPUT NUMBER : ");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        for (int i = 0; i < 10 ; i++){
            System.out.println(inputNum * 1);
        }

         */






















    }

}
