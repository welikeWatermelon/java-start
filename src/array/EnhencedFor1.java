package array;

public class EnhencedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};


        for(int i=0; i<numbers.length;i++){ //iter
            int number = numbers[i];
            System.out.println(number);
        }

        System.out.println();

        //향상된 for문, for-each문
        for(int number : numbers){
            System.out.println(number);
        }

        //for-each문을 사용할 수 없는 경우, 증가하는 index값 필요
        for(int i=0; i<numbers.length;i++){
            System.out.println("number" + i + "번의 결과는: "+numbers[i]);
        }
    }
}
