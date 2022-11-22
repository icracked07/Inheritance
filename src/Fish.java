public class Fish  extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int brain, int size, int body, int weight, int gills, int eyes, int fins) {
        super(brain, size, body, weight);
        // calls the constructor the super class which we are extending from.
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
        // it inaltialled other parameters also from super class.
    }

    private void rest() {
    }

    private void swim() {

    }

    private void moveMuscles() {

    }
    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
