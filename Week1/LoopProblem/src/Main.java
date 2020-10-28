import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Give me 5 numbers: ");
        for(int i = 0; i < 5; i++) {
            int nums = input.nextInt();
            numbers.add(nums);
        }
        int sum = 0;
        int product = 1;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            product *= numbers.get(i);
        }
        System.out.println("The sum is : " + sum);
        System.out.println("The product is : " + product);
        System.out.println("The largest number is: " + Collections.min(numbers));
        System.out.println("The smallest number is : " + Collections.max(numbers));
    }
}
