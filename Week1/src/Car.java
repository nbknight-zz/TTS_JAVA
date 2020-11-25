public class Car {

        //minimum 3 private instance variables
        private String make;
        private int year;
        private int horsePower;

        //an empty constructor
    public Car() {}

        //make a constructor that uses all variables
    public Car(String make, int year, int horsePower){
            this.make = make;
            this.year = year;
            this.horsePower = horsePower;
        }

        //make a constructor that uses 2 variables
    public Car(String make, int year){
            this.make = make;
            this.year = 2020;
        }

        //get methods for all three variables
        public String getMake () {
            return make;
        }

        public int getYear () {
            return year;
        }

        public int getHorsePower () {
            return horsePower;
        }

        //set methods for all three variables

        public void setMake (String make){
            this.make = make;
        }

        public void setYear ( int year){
            this.year = year;
        }

        public void setHorsePower ( int horsePower){
            this.horsePower = horsePower;
        }

        //write a method that returns a boolean
        public boolean carPresent(){
            return (!make.isEmpty());
        }

        //write a method that returns a string
        public String allInfo(){
           return ("The " + year + " " + make + " has " + horsePower + "hp.");
        }




}
