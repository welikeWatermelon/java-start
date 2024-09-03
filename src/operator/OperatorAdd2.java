package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a= 1;
        int b=0;
        b = ++a;
        System.out.println(a+" "+b);

        a= 1;
        b= 0;

        b=a++; // a의 현재 값을 b에 대입하고, 그 뒤 a의 1을 증가
        System.out.println(a+" "+b);
    }
}
