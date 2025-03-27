public abstract class Animal {

    // 필드
    protected String name;
    protected int age;
    protected final String species;

    // 생성자
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // 메소드
    public final void describe() {
        System.out.println(String.format("이름: %s, 나이: %d, 종: %s", name, age, species));
        makeSound();
        move();
    }

    public void increaseAge() {
        age++;
    }

    public abstract void makeSound();
    public abstract void move();
    
}
