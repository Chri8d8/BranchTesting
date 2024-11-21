public class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("woof");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }
}
