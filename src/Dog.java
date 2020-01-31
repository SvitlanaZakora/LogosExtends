public class Dog extends Animal {
    private int price;

    public Dog(int age, String color, String name) {
        super(age, color, name);
    }

    public Dog() {

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color" + getColor() + "," +
                "age" + getAge() + "," +
                "name" + getName() + "," + "}";

    }

}
