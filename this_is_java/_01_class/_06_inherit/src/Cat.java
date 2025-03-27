public class Cat extends Animal {
    
    public Cat(String name, int age) {
        super(name, age, "고양이");
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("조용히 걷습니다");
    }
}
