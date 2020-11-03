import java.util.*;
import java.util.concurrent.*;
public class Lambda {
    static String instance;
    public void constructor() {
        if (this.instance != null)
            return this.instance;
        else
            this.instance = "";
    }
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(98);
        grades.add(60);
        grades.add(80);
        grades.add(50);
        grades.add(55);

        grades.forEach(grade -> System.out.println(grade));


        grades.forEach(grade -> {
            System.out.println(grade); //allows for a multiline lamba
        });
    }

}
