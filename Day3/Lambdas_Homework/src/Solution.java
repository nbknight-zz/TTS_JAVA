import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Tests do you want to run?");
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            System.out.println("Please enter the test case: \n 1 for isOdd()\n 2 for isPrime()\n 3 for isPalindrome " +
                    "\n followed by a space and the integer you want to check and then hit enter.\n For instance: 1 4" +
                    " will run test 1 (isOdd()) and check if the number 4 is odd.");
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}