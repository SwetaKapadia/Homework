package instanceVariable;

public class activities {
    String Saturday;
    String Sunday;
    String Wednesday;
    String Thursday;

      public static void main(String[] args) {
          activities one = new activities();
          one.Sunday="Cricket";
          one.Wednesday="After School";
          one.Thursday="Karate";

          activities two = new activities();
          two.Saturday="Outing";
          two.Wednesday="Gujarati Class";
          two.Thursday="Swimming";

          System.out.println("First set of activities:");
          System.out.println("Sunday is "+one.Sunday);
          System.out.println("Wednesday is "+one.Wednesday);
          System.out.println("Thursday is "+one.Thursday);

          System.out.println("Second set of activities:");
          System.out.println("Saturday is "+two.Saturday);
          System.out.println("Wednesday is "+two.Wednesday);
          System.out.println("Thursday is "+two.Thursday);

    }
}
