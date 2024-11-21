public class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("moow");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }
}
