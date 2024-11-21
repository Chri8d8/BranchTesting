public class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("mooow");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }

    @Override
    boolean mood(boolean showMood) {
        if (showMood == true) {
            System.out.println("spinder");
        } else if (showMood == false) {
            System.out.println("hvæser");
        }
        return showMood;
    }
}
