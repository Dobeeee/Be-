package grammer.ch06_loop;

public class Main {
    public static void main(String[] args) {
        // for
        String[] stringArr = new String[10];
        for (int i = 0; i < 10; i++) {
            stringArr[i] = i + "";
        }
        System.out.println(stringArr[stringArr.length - 1]);
        System.out.println("=============================================");

        // for-each
        for (String str : stringArr) {
            System.out.println(str);
        }
        System.out.println("=============================================");

        // while
        int idx = 0;
        while (idx < stringArr.length) {
            System.out.println(stringArr[idx]);
            idx++;
        }
        System.out.println("=============================================");

        // do-while
        int idx2 = 0;
        do {
            System.out.println(stringArr[idx2]);
            idx2++;
        } while (idx2 < stringArr.length);
    }
}

