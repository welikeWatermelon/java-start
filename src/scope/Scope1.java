package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m alive
        if (true){
            int x = 20; //x alive
            System.out.println("if m = "+ m);
            System.out.println("if m = "+ x);
        } //x died
        //System.out.println("main x = "+ x);
        System.out.println("main x = "+ m);

    }//m died
}
