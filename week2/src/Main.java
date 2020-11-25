import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        staircase(10);
    }

    static void staircase(int n) {
//        for(int i = 1; i <= n; i++){
//            String str = "#";
//            System.out.printf("%15s\n", str.repeat(i));
//        }

        String s = ""; //empty string
        for(int i = 0; i < n; i++) { //loop until n
            s += "#";
            System.out.printf("%"+n+"s\n", s); //formats the string with the number of characters and right justifies
            // it.
        }


    }
}
