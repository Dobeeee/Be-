package grammer.ch04_array;

public class Main {
    public static void main(String[] args) {

        // 배열을 선언하고 할당하는 방식은 아래 두가지 방식이 있다.
        // 배열 초기화시 할당한 크기 만큼만 원소를 지정할 수 있다.
        // 배열의 원소에 접근할 떈 접근하려는 원소의 인덱스를 사용한다.


        int[] arr = new int [4];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 3;

        System.out.println("arr[0]" + arr[0]);
        System.out.println("arr[1]" + arr[1]);
        System.out.println("arr[2]" + arr[2]);


        int[] arr2 = {1, 2, 3, 4};
        System.out.println("arr2[0]" + arr2[0]);
        System.out.println("arr2[1]" + arr2[1]);
        System.out.println("arr2[2]" + arr2[2]);




    }
}

