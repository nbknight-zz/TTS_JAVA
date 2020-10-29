import java.util.concurrent.*;
public class SleepTest {
    public static void main(String[] args) {

        String topics[] = {"Concurency", "Multithreading", "Processes", "Threads"};
        for(int i = 0; i < topics.length; i++) {

            try {
                Thread.sleep(5000);
            } catch(InterruptedException ie) {
                return; //<= performs interrupt magic
            }
            System.out.println(topics[i]);
        }
    }
}
