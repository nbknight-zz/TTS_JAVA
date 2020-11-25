package practice;

import java.util.Random;

public class Password {
    public static int genRandom(int n) {
        Random rand = new Random();
        n = rand.nextInt(90000) + 10000;
        return n;
    }

}
