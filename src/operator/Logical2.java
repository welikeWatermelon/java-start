package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a= 15;
        boolean result1 = a > 10 && a < 20; //(a>10) && (a<20)
        System.out.println(result1);
        boolean result2 = 10 < a && a < 20; //(a>10) && (a<20)
        System.out.println(result2);
    }
}
