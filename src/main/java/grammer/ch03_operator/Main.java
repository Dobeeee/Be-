package grammer.ch03_operator;

import utils.PrintUtils;

import static java.lang.String.*;
import static utils.PrintUtils.*;

public class Main {

    public static void main(String[] args) {
        int num1 = 51;
        int num2 = 5;


        // 사칙연산자
        print(valueOf(num1 + num2));
        print(valueOf(num1 - num2));
        print(valueOf(num1 * num2));
        print(valueOf(num1 / num2));
        print(valueOf(num1 % num2));

        // 비교 연산자
        print(valueOf(num1 > num2));
        print(valueOf(num1 < num2));
        print(valueOf(num1 >= num2));
        print(valueOf(num1 <= num2));
        print(valueOf(num1 == num2));
        print(valueOf(num1 != num2));

        // 논리 연산자 : && , ||

        // 증감 연산자
        // 1. 전위 연산자
        int num3 = 5;
        print(valueOf(++num3));
        print(valueOf(num3));
        // 2. 후위 연산자
        print(valueOf(num3++));
        print(valueOf(num3));
    }
}
