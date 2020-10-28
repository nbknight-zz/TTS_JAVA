import java.util.*;
public class Main {


    public static void main(String[] args) {
        // We'll be using user input
        Scanner input = new Scanner(System.in);
        // Create a hash map of vehicles;
        HashMap<String,String> vehicles = new HashMap<>();
        vehicles.put("F150","Ford");
        vehicles.put("Mustang","Ford");
        vehicles.put("Camaro","Chevy");
        vehicles.put("Silverado","Chevy");
        vehicles.put("Wrangler","Jeep");

        System.out.println("What kind of car are you looking for? ");
        String model = input.nextLine();
        if(vehicles.containsKey(model)){
            String make = vehicles.get(model);
            System.out.println("Oh, you're looking for a " + model + "? Our " + make + " section is over this way.");
        }else {
            System.out.println("Sorry, we are currently out of those.");
        }

    }
}
