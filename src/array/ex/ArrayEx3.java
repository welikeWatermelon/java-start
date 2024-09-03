package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i=4;i>=0;i--){
            array[i]=scanner.nextInt();
        }
        for (int i=0;i<5;i++){
            if (i==4){
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i]+", ");

        }
    }
}
