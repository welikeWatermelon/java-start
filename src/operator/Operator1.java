package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a =5;
        int b =2;

        int sum = a+b;
        System.out.println(sum);

        int diff = a-b;
        System.out.println(diff);

        int multi = a*b;
        System.out.println(multi);

        int div = a/b ;//-> 소수점 무시됨
        System.out.println(div);

        int mod = a%b;
        System.out.println(mod);
    }
}
