package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        int sum = 0;
        for (int i=0;i<5;i++){
            array[i]=scanner.nextInt();
            sum+=array[i];
        }

        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+sum/array.length);
    }
}
