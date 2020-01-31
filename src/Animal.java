public class Animal {
    private String color;
    private int age;
    private String name;

    public Animal(){

    }

    public Animal(int age, String color, String name){
        this.age=age;
        this.color=color;
        this.name=name;
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void speak(){
        System.out.println("I am speaking");
    }

    public String getColor() {
        return color;
    }


    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


}
