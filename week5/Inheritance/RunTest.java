package week5.Inheritance;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Fruit:");
        Fruit fruit = new Fruit();
        fruit.typesOfFood();
        fruit.eat();

        System.out.println("Mango:");
        Mango mango = new Mango();
        mango.typesOfFood();
        mango.eat();
        mango.nutrient();
        mango.purpose();

        System.out.println("Chips:");
        Chips chips = new Chips();
        chips.typesOfFood();

        System.out.println("Vegetables:");
        Vegetables veggies = new Vegetables();
        veggies.typesOfFood();
        veggies.quantity();
        veggies.nutrient();
        veggies.purpose();

        System.out.println("Pulses");
        Pulses pulses = new Pulses();
        pulses.typesOfFood();
        pulses.eat();
        pulses.nutrient();
    }
}
