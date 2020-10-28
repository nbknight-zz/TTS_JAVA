public class Pet { //create a Pet class
    //create the following variables: name, location, age, type
    private String name;
    private String location;
    private int age;
    private String type;

    public Pet(){};
    public Pet(String name, String location, int age, String type) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }



}
