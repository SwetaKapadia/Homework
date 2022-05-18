package instanceVariable;

public class menu {
    String breakfast;
    String lunch;
    String dinner;

    public static void main(String[] args) {
        menu menu = new menu();
        menu.breakfast="Cereal";
        menu.lunch="Paneer";
        menu.dinner="Soup";

        System.out.println("Breakfast: "+ menu.breakfast);
        System.out.println("Lunch: "+ menu.lunch);
        System.out.println("Dinner: "+ menu.dinner);
    }
}
