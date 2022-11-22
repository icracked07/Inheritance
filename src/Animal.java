public class Animal {
        private int brain;
        private int size;
        private int body;
        private int weight;

        public Animal(int brain, int size, int body, int weight) {
            this.brain = brain;
            this.size = size;
            this.body = body;
            this.weight = weight;
        }
        public void eat() {
            System.out.println("Animal eat");
        }
        public  void move() {
            System.out.println("Animal move() called");
        }
        public void move (int speed) {
            System.out.println("Animal is moving at " + speed);
        }
        public int getBrain() {
            return brain;
        }

        public int getSize() {
            return size;
        }

        public int getBody() {
            return body;
        }

        public int getWeight() {
            return weight;
        }
    }
