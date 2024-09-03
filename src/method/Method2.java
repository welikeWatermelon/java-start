package method;

import org.w3c.dom.ls.LSOutput;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("= 프로그램이 동작합니다.=");
        printFooter();
    }

    public static void printHeader(){ //void : 반환타입이 없는것
        System.out.println("= 프로그램을 시작합니다. =");
        return; //생략 가능
    }

    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다. =");
    }
}
