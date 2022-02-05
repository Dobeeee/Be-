package grammer.ch5_codition;

import utils.PrintUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isTrue = true;
        boolean isFalse = false;

        // IF, IF-ELSE, IF-ELSE IF
        if (isTrue){
            PrintUtils.print("[if] call!");
        }

        if (isFalse){

        } else {
            PrintUtils.print("[else] call!");
        }

        if (isFalse){

        } else if (isTrue){
            PrintUtils.print("[else if] call!");
        } else {

        }

        Scanner scanner = new Scanner(System.in);
        PrintUtils.print("=============");
        PrintUtils.print("input A, B, C : ");
        PrintUtils.print("=============");
        System.out.print("> ");
        String caseVar = scanner.next();

        // switch - case
        switch (caseVar){
            case "A":
                PrintUtils.print("A!");
                break;
            case "B":
                PrintUtils.print("B!");
            case "C":
                PrintUtils.print("C!");
                break;
            default:
                PrintUtils.print("DEFAULT!");
        }

        scanner.close();




    }
}
