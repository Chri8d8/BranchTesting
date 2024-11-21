public class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("mooow");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }
}
