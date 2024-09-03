package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7){
            System.out.println("미취학");
        }
        if (8 <= age && age<=13){ // 7살 이상인데, 8살 이상만 필요하다고 하니 조건을 중복체크 한 것임
            System.out.println("초등학생");
        }
        else{
            System.out.println("스킵");
        }
    }
}
