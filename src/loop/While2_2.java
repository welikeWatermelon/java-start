package loop;

public class While2_2 {
    public static void main(String[] args) {
        int endNum=3;
        int i = 1;
        int sum=0;

        while (i<=endNum){
            sum += i;
            System.out.println("i= "+ i + " sum= "+ sum);
            i++;
        }
    }
}


