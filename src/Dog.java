public class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("woof");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }

    @Override
    boolean mood(boolean showMood) {
        if (showMood == true) {
            System.out.println("logrer");
        } else if (showMood == false) {
            System.out.println("knurrer");
        }
        return showMood;
    }

}
