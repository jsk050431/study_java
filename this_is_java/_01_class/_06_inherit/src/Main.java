public class Main {
    public static void main(String[] args) throws Exception {
        
        Animal[] animals = {
            new Dog("바둑이", 3),
            new Cat("나비", 2)
        };

        for (int i=0; i<3; i++) {
            for (Animal animal : animals) {
                animal.describe();
                animal.increaseAge();
            }
            if (i<2) {
                System.out.println("====== 1년 후 ======");
            }
        }
    }
}
