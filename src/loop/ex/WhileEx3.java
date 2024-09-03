package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max=1;
        int sum = 0;
        while(max<=3){
            System.out.println("//max="+max);
            sum+=max;
            System.out.println(sum);
            max++;
        }

        sum=0;
        for (max = 1; max<=3;max++){
            System.out.println("//max="+max);
            sum+=max;
            System.out.println(sum);
        }
    }
}
