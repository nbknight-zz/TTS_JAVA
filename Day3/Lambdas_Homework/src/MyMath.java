interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd(){
        return p -> (p % 2 != 0);
    }

    PerformOperation isPrime(){
        return p -> {
            if(p <=1) {
                return false;
            }
            for(int i =2; i <= p/2; i++) {
                if(p % i == 0) {
                    return false;
                }
            }return true;
        };
    }

    PerformOperation isPalindrome(){
        return p -> {
            int reverse = 0;
            int original = p;

            while (original != 0) {
                int lastDigit = original % 10;
                reverse *= 10;
                reverse += lastDigit;
                original /= 10;
            }
            return reverse == p;
        };
    }
}
