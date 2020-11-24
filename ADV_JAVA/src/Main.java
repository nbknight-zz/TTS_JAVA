import javax.sound.midi.Soundbank;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
//        arrays - list of items
//        denoted in [] brackets
//        can access specific locations by index (zero based)
//        .length will tell you the number;
//        highest index = .length[-1]
        String[] fruit;
        int[] myGrades;
        String[] names = {"Nick","Felicia","Preston"};
        System.out.println(names.length);
        System.out.println(names[1]);

//        all elements in the array are the same data type
//        add to the array by using push

        //Collections Framework is the same as external libraries
        // for instance linked list.

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();
        List<String> list4 = new Stack<>();

        // Array lists have built in methods:
            //add, remove, and get

        list1.add("World");
        list1.add("And Another");

        System.out.println(list1.get(1));

        //hashmap -> stores key value pairs;
        //declare a hashmap:
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Nick", 93);
        grades.put("Felicia", 90);
        grades.put("Tom", 33);
        System.out.println(grades.get("Tom"));
        System.out.println(grades.isEmpty());
        //common methods: put, get, remove, contains
        System.out.println(grades.containsValue(93));
        System.out.println(grades.toString());

        //LindedList - a collection of information that can only be
        // accessed from known starting points
        // has: head(infront of list), last (end of list), each node has a next
        //Linked list nodes are stored randomly in memory
        //singly linked list -
            // head -> [value | next] => [value | next ] => [value | next] => null
        list2.add("orange");
        list2.add("apple");
        list2.add("banana");

        System.out.println(list2.toString());
        ((LinkedList<String>) list2).addFirst("Strawberry");
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);

        //queues (fifo) first in first out
        //always adds to the end of the line

        Queue<String> q = new LinkedList<>();
        //generic linked lists can be removed from anywhere
        //Queues are a special implementation of a linked list
        // can only remove from the front
        // can only add to the rear
        ((LinkedList<String>) q).addFirst("Fred");
        System.out.println(q.size());

        //Stack (lifo) last in first out

        // special implementation of a linked list
        // removes and adds at the front only.

        Stack<String> stk = new Stack<>();
        System.out.println(stk.size());
        stk.push("temp");
        stk.push("Freelancer");
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.push("db");
        stk.pop();
        System.out.println(stk);

        //iterating through
        list1.size();

        for (String word: list1) {
            System.out.println(word);
        }

        for(Map.Entry<String, Integer> entry: grades.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " : " + value);
        }

        //OOP Principles


        //go for Polymorphism, abstraction, encapsulation, inheritance, cohesion, coupling

        //Abstract your data
        //Car Object
            // properties
                //Wheels
                //Windows
                //Seats
                //Steering
                //Engine
                //Color
            //Methods
                // public getter methods
                // public setter methods
                // public getAllAddons - specific to brand/class of car
                        //anyone can call

                // private method basePrice - specific to a brand of car
                        //used only by the class

                // protected methods
                        //used by this class and classes that inherit
                // protected method spyPackage - stays the same


        //Error Handeling
        // found io library

        //#exceptions
        //# Look before you leap - LBYL
        //# Easier to Ask Forgiveness than Permission - EAFP

        //LBYL - checking for nulls before using a variable
            // checking that an array has data
        //EAFP -
        // try (code that may throw an error
        // } catch(Exception) {
        //  handle error
        // }

        // try syntax
//        try {
//            //code
//        } catch (IOException ioe) {
//            //gracefully handle it
//        } finally {
//            //clean up
//        }

        //getting user input
        // java.util has a scanner class: java.util.Scanner

        Scanner reader = new Scanner(System.in);
//        System.out.println("enter some text here: ");
//        String text = reader.nextLine();
//        System.out.println("the text you entered is: " + text);
        try {
            System.out.println("Enter some text: ");
            int num = reader.nextInt();
            System.out.println("The text you entered is: " + num);
        } catch (InputMismatchException imme) {
            System.out.println("You entered the wrong stuff");
            //if you want to throw your own exception
            throw new Exception("something went horribly wrong");
        }

    }
}
