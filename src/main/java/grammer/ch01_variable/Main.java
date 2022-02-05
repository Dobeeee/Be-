package grammer.ch01_variable;

public class Main {

    public static void main(String[] args) {
        String key; // 1. 선업 or 초기화
        key = "value";

        String key2 = "value2";  // 2. 선언  그리고 할당

        final String key3 = "value3";  // 3. final 키워드 선언 = 재할당 불가

        System.out.println(key);
        System.out.println(key2);
        System.out.println(key3);


    }
}
