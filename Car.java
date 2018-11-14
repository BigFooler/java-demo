class Car {
    String color = "red";
    int num = 4;
    private int age;
    void run() {
        System.out.println(color + "," + num);
    }
}

/**
 * 
 */
class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "blue";
        c.run();
        Car c1 = new Car();
        c1.run();
    }
}