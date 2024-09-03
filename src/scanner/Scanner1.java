package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //ctrl + spacebar -> scanner를 자동으로 쳐줌

        System.out.println("문자열을 입력하세요:");
        String str = scanner.nextLine(); //입력을 string
        System.out.println("입력한 문자열: "+ str);

        System.out.println("정수를 입력하세요:");
        int intValue = scanner.nextInt(); //입력을 int
        System.out.println("입력한 정수: "+ intValue);

        System.out.println("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble(); //입력을 double
        System.out.println("입력한 실수: "+ doubleValue);
    }
}
