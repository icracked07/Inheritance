public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private  String coat;

    // public Dog(int name , int brain , int body , int weight) {}
    public Dog(int size, int weight , int eyes , int legs ,int tail,int teeth,String coat) {
        //super(name,brain,body,size,weight)
        super(1, 20, 1, 100);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        //super.move();
        System.out.println("Dog.move() called");
        moveLegs(speed);
    }
    @Override
    public void eat() {
        //super.eat();
        System.out.println("Dog.eat() called");
        chew();
    }
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(10);
    }
    public void run() {
        System.out.println("Dog run() called");
        move(10);
    }
    private void chew() {
        System.out.println("Dog.chew() called");
    }
}
