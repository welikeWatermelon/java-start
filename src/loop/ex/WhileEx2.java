package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 10;
        int cnt = 1;
        while (cnt<=num){
            System.out.println(cnt*2);
            cnt++;
        }

        for (num=1;num<=10;num++){
            System.out.println(num*2);
        }
    }
}
