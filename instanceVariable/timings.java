package instanceVariable;

public class timings {
    String lunch;
    String dinner;
    String breakfast;

    public static void main(String[] args) {
        timings meal = new timings();
        meal.breakfast = "7am";
        meal.lunch = "12pm";
        meal.dinner = "6pm";

        System.out.println("Meal times:");
        System.out.println("Breakfast is at "+meal.breakfast);
        System.out.println("Lunch is at "+meal.lunch);
        System.out.println("Dinner is at "+meal.dinner);
    }
}
