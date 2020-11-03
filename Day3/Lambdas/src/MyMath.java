public class MyMath {

    public static int math(int x) {
        return x -> (x % 2) == 1;
    }
    public static void main(String[] args) {
        System.out.println(math(5));
    }



}
