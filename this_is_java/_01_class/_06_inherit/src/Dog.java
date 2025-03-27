public class Dog extends Animal {
    
    // 생성자
    public Dog(String name, int age) {
        super(name, age, "개");
    }

    // 메소드
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("신나게 달립니다");
    }
}
