public class Car {

    // 필드
    String brand;
    String model;
    int year;
    int speed = 0;

    // 생성자
    Car() {
        this("Unknown", "Unknown", 2000);
    }

    Car(String brand, String model) {
        this(brand, model, 2000);
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 메소드
    void accelerate() {
        speed += 10;
    }

    void accelerate(int amount) {
        speed += amount;
    }

    void brake(int amount) {
        if (speed >= amount) {
            speed -= amount;
        }
        else {
            speed = 0;
        }
    }

    void displayInfo() {
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("year: " + this.year);
        System.out.println("speed: " + this.speed);
    }
}
