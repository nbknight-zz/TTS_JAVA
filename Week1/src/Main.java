public class Main {

    public static void main(String[] args) {
	// write your code here

            Car car1 = new Car("Honda", 2020, 187);
            Car car2 = new Car("Ford", 2017, 208);
            Car car3 = new Car("BMW", 2020, 187);

            car1.setMake("Chevy");
            System.out.println(car1.carPresent());
            System.out.println(car1.allInfo());



    }

}
