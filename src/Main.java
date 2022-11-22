public class Main {
    public static void main(String args[]) {
        Animal animal = new Animal(1, 1, 5, 5);
        Dog dog = new Dog(30, 50, 2, 2, 1, 2, "black");
        dog.eat();
        dog.walk();
        dog.run();
    }
}