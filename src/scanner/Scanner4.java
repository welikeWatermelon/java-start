package scanner;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("문자열을 입력하세요(exit : 종료)");
            String str = scanner.nextLine();
            if (str.equals("exit")){ //문자열 비교는 원래.equals(비교)
                break;
            }

        }
    }
}
