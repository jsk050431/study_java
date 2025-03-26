public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car();
        Car car2 = new Car("aaa", "01");
        Car car3 = new Car("bbb", "02", 2022);

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        System.out.println("===================");
        car1.accelerate();
        car1.displayInfo();
        car1.brake(20);
        car1.displayInfo();
        System.out.println("===================");
        car2.accelerate(100);
        car2.displayInfo();
        car2.brake(50);
        car2.displayInfo();

    }
}
